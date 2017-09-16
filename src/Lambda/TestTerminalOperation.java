package Lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestTerminalOperation {

    public static void main(String[] args) {


        /* Example of (toArray)
         * This method convert any list object to array
        * */



        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(4);
        obj.add(3);

        Object[] objArr = obj.stream().toArray();
        Integer[] arr =getList(objArr);
        for (Integer i : arr) System.out.println(i);




         /* Example of (reduce)
          * Stream.reduce operations are commonly found in statistic operations
          * such as long summary statistics and combine the stream elements
          * into one using a BinaryOperator
         * */


        BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return (integer+integer2);
            }
        };

        /* implement implicitly */
        int num=obj.stream().reduce(9,(a,b)-> {return (a+b);});

        /* implement Explicitly */
        int num1=obj.stream().reduce(9,binaryOperator);
        System.out.println(num);
        System.out.println(num1);




    }


    private static Integer[] getList(Object[] obj) {
        Integer[] val = new Integer[obj.length];
        for (int i = 0; i < obj.length; i++) val[i] = (Integer) obj[i];
        return val;
    }
}
