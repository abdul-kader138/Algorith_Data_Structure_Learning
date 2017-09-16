package Lambda;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
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




        /* Example of (Collect-Collectors.toSet())
          * The Stream.collect terminal operation will convert
          * the stream into some other container such as a list.
          * */


        Integer[] intArr = {1, 2, 3, 5, 4, 3};


        Set<Integer> list = Arrays.asList(intArr).stream().collect(Collectors.toSet());
        System.out.println(list.size());





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
