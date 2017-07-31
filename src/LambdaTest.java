/**
 * Developer: Abdul Kader
 * Date- 07/31/2017.
 **/


import java.util.*;

public class LambdaTest {


    public static void main(String[] args) {

        /* Lambda test for functional interface */
        LambdaInterface lambdaInterface = (int[] a) -> {
            return a[0];
        };

        int[] a = new int[3];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        System.out.println(lambdaInterface.add(a));


        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, 28, "D"));
        list.add(new Employee(2, 29, "S"));
        list.add(new Employee(3, 27, "C"));
        list.add(new Employee(4, 29, "A"));
        list.add(new Employee(5, 28, "B"));

        Map<String, Integer> check = new HashMap<>();
        check.put("BABU1", 1);
        check.put("BABU2", 2);
        check.put("BABU3", 3);
        check.put("BABU4", 4);
        check.put("BABU5", 5);


        /* Lambda test for Comparator interface */
        Collections.sort(list);

        list.forEach((v) -> System.out.println(v.getId() + "-----" + v.getName()));
        Collections.sort(list, (x, y) -> {
            return x.getName().compareTo(y.getName());
        });

        System.out.println("----------------------------------------------------");

        list.forEach((v) -> System.out.println(v.getId() + "-----" + v.getName()));
    }
}


