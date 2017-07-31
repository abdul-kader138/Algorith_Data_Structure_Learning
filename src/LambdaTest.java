/**
 * Developer: Abdul Kader
 * Date- 07/31/2017.
 **/


import java.util.*;
import java.util.stream.Stream;

public class LambdaTest {


    public static void main(String[] args) {

        /* Lambda test for functional interface

         /*
           * For functional interface
           * 1) first need to define method at interface
           * 2)then at concrete class need to declare method body
           * 3)After that we can used that method
           *
           *
        */



        /*
        LambdaInterface lambdaInterface = (int[] a) -> {
            return a[0];
        };

        int[] a = new int[3];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        System.out.println(lambdaInterface.add(a));

        */

        LambdaInterface<String, Integer> lambdaInterface1 = (z) -> {
            return Integer.valueOf(z);
        };
        Integer val = lambdaInterface1.valueOfInteger("123");
        System.out.println(val);



         /* Lambda test for Comparator interface */
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

        Collections.sort(list);

        list.forEach((v) -> System.out.println(v.getId() + "-----" + v.getName()));
        Collections.sort(list, (x, y) -> {
            return x.getName().compareTo(y.getName());
        });

        System.out.println("----------------------------------------------------");

        list.forEach((v) -> System.out.println(v.getId() + "-----" + v.getName()));


     /* Lambda test for Stream API */
        Stream<Employee> stream = list.stream().filter(p -> p.getId() > 3);
        stream.forEach((n) -> System.out.println((String) n.getName()));


    }
}




