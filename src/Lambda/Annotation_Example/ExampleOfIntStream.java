package Lambda.Annotation_Example;

import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleOfIntStream {


    public static void main(String[] args){


        /* Get as int  */
        IntStream intStream=IntStream.of(1,3,5,7,8);
        IntStream intStream1=IntStream.of(2,4,6,8,7);
        IntStream intStream2=IntStream.of(2,4,6,8,7);
        int sum=IntStream.concat(intStream,intStream1).parallel().distinct().max().getAsInt();
        System.out.println(sum);


        IntToDoubleFunction intToDoubleFunction=new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return  (double) value;
            }
        };
        intStream.close();


        /* change the int type to Double */
        Double d=intStream2.parallel().mapToDouble(intToDoubleFunction).max().getAsDouble();
        System.out.println(d);


        /* boxed()- Used to convert primitive type stream to Object type stream */


        IntSupplier intSupplier=new IntSupplier() {
            Random random=new Random();
            @Override
            public int getAsInt() {
                int num= random.nextInt(100);
                return num;
            }
        };

        List<Integer> stream= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
        stream.forEach(System.out::println);
    }
}
