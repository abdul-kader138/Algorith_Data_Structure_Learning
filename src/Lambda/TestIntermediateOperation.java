package Lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntermediateOperation {


    public static void main(String[] args) {



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



    }
}
