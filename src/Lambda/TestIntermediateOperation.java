package Lambda;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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







        /* Example of (map())
          *  Stream.map will transform the elements elements in a
          *  stream using the provided java.util.function.Function.
          * A function is a method that accepts an argument and produces
          * a result. They are commonly used for transforming collections
          * and can be seen in the transforming a list to a map example.
          * */


        Function<Emp, Integer> function = new Function<Emp, Integer>() {
            @Override
            public Integer apply(Emp emp) {
                return emp.getAge();
            }
        };


        List<Integer> list = empList.parallelStream().map(function).collect(Collectors.toList());
        list.forEach(System.out::println);




        /* Example of (flatMap())
        * Stream.flatmap will transform each element into zero or more elements
        * by a way of another stream. To demonstrate, we pulled code snippet from
        * how to count unique words in a file example. Using java 7 file api,
        * we will read all lines from a file as a Stream. Then calling Stream.
        * flatmap we will break the line into words elements. If we had a line
        * made up of "the horse was walking down the street", this line would be
        * broken into ["the", "horse", "was", "walking", "down", "the", "street"].
        * Calling the the Stream.distinct method will find all unique occurrences of words.
        * */


        File file = new File("test.txt");


        long wordCount = 0;
        Path textFilePath = Paths.get("E:\\Test\\WordCount.txt");
        try {
            Stream<String> fileLines = Files.lines(textFilePath, Charset.defaultCharset());
            wordCount = fileLines.flatMap(line -> Arrays.stream(line.split(" "))).count();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Number of words in WordCount.txt: " + wordCount);




        /*  Example of peek()
        * The Stream.peek is extremely useful during debugging.
        * It allows you to peek into the stream before an action
        * is encountered.
        * */


        Consumer<Emp> emp31 = new Consumer<Emp>() {
            @Override
            public void accept(Emp emp) {
                if (emp.getName().length() >= 4) System.out.println(emp.getName());
            }
        };


        List<String> nameList = empList.parallelStream().peek(emp31).map(a -> {
            Emp ac = (Emp) a;
            return ac.getName();
        }).collect(Collectors.toList());
        System.out.println("================================");
//        nameList.forEach(System.out::println);

    }
}
