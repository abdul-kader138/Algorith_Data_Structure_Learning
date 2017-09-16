package Lambda;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTerminalOperation {

    public static void main(String[] args) {


        /* Example of (toArray)
         * This method convert any list object to array
        * */


        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(4);
        obj.add(4);
        obj.add(3);

        Object[] objArr = obj.stream().toArray();
        Integer[] arr = getList(objArr);
        for (Integer i : arr) System.out.println(i);




         /* Example of (reduce)
          * Stream.reduce operations are commonly found in statistic operations
          * such as long summary statistics and combine the stream elements
          * into one using a BinaryOperator
         * */


        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return (integer + integer2);
            }
        };

        /* implement implicitly */
        int num = obj.stream().reduce(9, (a, b) -> {
            return (a + b);
        });

        /* implement Explicitly */
        int num1 = obj.stream().reduce(9, binaryOperator);
        System.out.println(num);
        System.out.println(num1);





        /* Example of (Map-max,min)
          * Stream.max will find the maximum element of the
          *
          * Stream.max will find the minimum element of the
          *
          *
          * stream according to a specified comparator
          * */


        List<Emp> empList = new ArrayList<>();
        Emp emp = new Emp("PPFL", 30);
        Emp emp1 = new Emp("PPL", 40);
        Emp emp2 = new Emp("PFL", 50);
        Emp emp3 = new Emp("PCFL", 20);

        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        Function function = new Function() {
            @Override
            public Integer apply(Object o) {
                Emp emp = (Emp) o;
                return emp.getAge();
            }
        };

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;
                if (o1 > o2) return 1;
                return 0;
            }
        };

        Optional<Integer> h = empList.stream().map(function).min(comparator);
        Optional<Integer> l = empList.stream().map(function).min(comparator);
        System.out.println(h.get());
        System.out.println(l.get());







        /* Example of (AnyMatch,AllMatch)
          * Stream.anyMatch will find out whether at least one
          * of the elements in the stream matches a given predicate.
          *
          * Stream.allMatch will check every element in the
          * stream and find out if it matches the predicate.
          * */

        Predicate<Emp> predicate = new Predicate<Emp>() {
            @Override
            public boolean test(Emp emp) {
                if (emp.getAge() == 50) return true;
                return false;
            }
        };

        boolean result = empList.stream().anyMatch(predicate);
        boolean result1 = empList.stream().allMatch(predicate);
        System.out.println(result);
        System.out.println(result1);





       /* Example of (findFirst,findAny)
          * Stream.findFirst will find the first element in the stream
          * which is resembles the same behavior as getting the first
          * element in a list.
          *
          *
          * Similar to finding any element in array, Stream.findAny
          * will find any element in a given stream.
          * */


        Optional<Emp> empObj=empList.stream().findFirst();
        Optional<Emp> empObj1=empList.stream().findAny();
        System.out.println(empObj.get().getName());
        System.out.println(empObj1.get().getName());





        /* Example of (Collect-Collectors.toSet())
          * The Stream.collect terminal operation will convert
          * the stream into some other container such as a list.
          * */


        Integer[] intArr = {1, 2, 3, 5, 4, 3};


        Set<Integer> list = Arrays.asList(intArr).stream().collect(Collectors.toSet());
        System.out.println(list.size());
        double b = Arrays.asList(intArr).stream().collect(Collectors.toSet()).stream().collect(Collectors.averagingInt(a -> {
            return a;
        }));
        System.out.println("Average -" + b);





        /* Example of (Collect-Collectors.averagingInt())
          * returns a Collector that produces the arithmetic mean
          * of an integer-valued function applied to the input elements
          * */


        ToIntFunction<Integer> integerToIntFunction = new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        };


            /* implement implicitly */
        double average = Stream.of(1, 2, 2, 4, 4).collect(Collectors.averagingInt(a -> {
            return a;
        }));
        System.out.println(average);

           /* implement Explicitly */
        double average1 = Stream.of(1, 2, 2, 4, 4).collect(Collectors.averagingInt(integerToIntFunction));


    }


    private static Integer[] getList(Object[] obj) {
        Integer[] val = new Integer[obj.length];
        for (int i = 0; i < obj.length; i++) val[i] = (Integer) obj[i];
        return val;
    }
}
