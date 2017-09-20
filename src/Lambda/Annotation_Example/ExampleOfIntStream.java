package Lambda.Annotation_Example;

import java.util.stream.IntStream;

public class ExampleOfIntStream {


    public static void main(String[] args){


        /* Get as int  */
        IntStream intStream=IntStream.of(1,3,5,7,8);
        IntStream intStream1=IntStream.of(2,4,6,8,7);
        int sum=IntStream.concat(intStream,intStream1).parallel().distinct().max().getAsInt();
        System.out.println(sum);
    }
}
