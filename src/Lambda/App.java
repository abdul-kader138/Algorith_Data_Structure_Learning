package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class App {

    public static void main(String[] args) {


        String name = "Hello World";

        /*
        * Params: String, Interface
        * Here we used the power of Lambda and implementing interface using Lambda
        * */

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        methodReferenceTest.getResult(name, (val) -> {
            return val.toUpperCase();
        });


        /*
        * Params: String, Interface
        * Here we used Method reference of String Parser Class
        * */

        StringParser stringParser = new StringParser();
        methodReferenceTest.getResult(name, stringParser::print);


       /*
        * Params: String, Interface
        * Here we used Method reference of String Parser Class
        * */


        Consumer<Emp> consumer = (obj) -> {
            if (obj.getName().length() <= 3) System.out.println(obj.getName().toLowerCase());
            else System.out.println(obj.getName().toUpperCase());
        };

        Emp e = new Emp();
        e.setName("Abdul Kader");
        e.setAge(31);

        Emp e1 = new Emp();
        e1.setName("Abdul Kader Babu");
        e1.setAge(31);

        Emp e2 = new Emp();
        e2.setName("DIP");
        e2.setAge(31);

        List<Emp> empList = Arrays.asList(e, e1, e2);

        empList.stream().forEach(consumer);


    }
}
