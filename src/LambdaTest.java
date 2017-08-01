/**
 * Developer: Abdul Kader
 * Date- 07/31/2017.
 * Lambda-Java 8 new functionality testing
 **/


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
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

        /*
          or will provide same output
          LambdaInterface<String, Integer> lambdaInterface1=Integer::valueOf;
         */
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


        /* Comparator functional interface checking */
        Comparator<Employee> comparator = (emp3, emp4) -> emp3.getName().compareTo(emp4.getName());
        Employee emp3 = new Employee(5, 28, "ABB");
        Employee emp4 = new Employee(5, 28, "ABB");
        System.out.println(comparator.compare(emp3, emp4));




     /* Lambda test for Stream API */
        Stream<Employee> stream = list.stream().filter(p -> p.getId() > 3);
        stream.forEach((n) -> System.out.println((String) n.getName()));


    /* Supplier functional interface */
        Supplier<Employee> supplier = Employee::new;
        Employee emp = supplier.get();
        emp.setId(1371);
        emp.setAge(43);
        emp.setName("Human");
        System.out.println(emp);
        System.out.println(supplier.get());



    /* Consumers functional interface */

        Consumer<Employee> consumer=(p)-> System.out.println(p.getName());
        consumer.accept(new Employee(1121,45,"Human Being"));


    /* Optional interface */

        Optional<Employee> empOptional=Optional.of(emp);
        System.out.println(empOptional.get());
        System.out.println(empOptional.isPresent());
        Employee emp22=new Employee(132,45,"MMMM");
        empOptional.orElse(emp22);
        Supplier<Employee> supplier1 = Employee::new;
        System.out.println(empOptional.orElseGet(supplier1));





    /* Stream interface and filter */

        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(1381,31,"11"));
        empList.add(new Employee(1382,32,"12"));
        empList.add(new Employee(1383,33,"21"));
        empList.add(new Employee(1384,34,"33"));
        empList.add(new Employee(1385,35,"411"));
        empList.add(new Employee(1386,36,"345"));
        empList.add(new Employee(1387,37,"432"));
        empList.add(new Employee(1388,38,"678"));

        /*
        * Stream represents a sequence of elements on which one or more operations can be performed.
        * filter is a operation which performed on stream
        * */

       empList.stream().filter((empObj)->empObj.getAge()>35).forEach(System.out::println);
       empList.stream().filter((empObj)->empObj.getAge()>35).forEach((p)-> System.out.println(p.getName()));





        /* Stream interface and sort */

        empList.stream().sorted((a,b)-> a.getName().compareTo(b.getName())).filter((empObj)->empObj.getAge()>35).forEach(System.out::println);






        /* Stream interface and Map */

        /*
        * Stream represents a sequence of elements on which one or more operations can be performed.
        * The intermediate operation map converts each element into another object via the given function.
        * */
        empList.stream().map((p)->p.getName().toUpperCase())
                .sorted((a,b)->a.compareTo(b)).filter((a)->a.startsWith("AB")).forEach(System.out::println);


        System.out.println(empList.stream().map((p)->p.getName().toUpperCase())
                .sorted((a,b)->a.compareTo(b)).filter((a)->a.startsWith("AB")).count());

        empList.stream().mapToInt((p)->Integer.parseInt(p.getName())).forEach(System.out::println);



        /* Stream interface and match */
        /*
        * Various matching operations can be used to check whether a certain predicate matches the stream.
        * */
        System.out.println(empList.stream().anyMatch((p) -> p.getName().startsWith("1")));


    }
}




