package Lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestIntermediateOperation {


    public static void main(String[] args) {


        List<Emp> empList = new ArrayList<>();
        Emp emp = new Emp("PPFL", 30);
        Emp emp1 = new Emp("PPFL1", 30);
        Emp emp2 = new Emp("PPFL2", 30);
        Emp emp3 = new Emp("PPL", 40);
        Emp emp4 = new Emp("PFL", 50);
        Emp emp5 = new Emp("PFL1", 50);
        Emp emp6 = new Emp("PCFL", 20);

        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);






        /* Example of (distinct())
          *  distinct work fine for default Object like String,Integer
          *  For user define it is wise to user Collectors.groupBy operation
          * */

        List<Integer> intLIst = new ArrayList<>();
        intLIst.add(3);
        intLIst.add(4);
        intLIst.add(3);
        intLIst.add(4);
        intLIst.add(3);
        intLIst.add(5);
        intLIst.add(6);
        List<Integer> rs = intLIst.parallelStream().distinct().collect(Collectors.toList());
        rs.forEach(System.out::println);

        List<String> strLIst = new ArrayList<>();
        strLIst.add("Babu");
        strLIst.add("Babu1");
        strLIst.add("BABU");
        strLIst.add("babu ");
        strLIst.add("babu");
        strLIst.add("Babu");
        List<String> s = strLIst.parallelStream().distinct().collect(Collectors.toList());
        s.forEach(System.out::println);









         /* Example of (filter())
          *  Stream.filter operation will return a new stream
          *  that contains elements that match its predicate
          * */


        Predicate<Emp> predicate = new Predicate<Emp>() {
            @Override
            public boolean test(Emp emp) {
                if (emp.getAge() > 30) return true;
                else return false;
            }
        };


         /* implement Explicitly */
        List<Emp> empObj = empList.parallelStream().filter(predicate).collect(Collectors.toList());
        empObj.forEach(System.out::println);



         /* implement implicitly */
        List<Emp> empObj1 = empList.parallelStream().filter((a) -> {
            Emp e = (Emp) a;
            if (a.getAge() > 30) return true;
            else return false;
        }).collect(Collectors.toList());
        empObj1.forEach(System.out::println);


    }
}
