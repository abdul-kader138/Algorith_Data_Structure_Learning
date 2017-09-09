package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;


public class App {

    public static void main(String[] args) {


        String name = "Hello World";

        /* Example of (Functional interface)
        * Params: String, Interface
        * Here we used the power of Lambda and implementing interface using Lambda
        * */


        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        methodReferenceTest.getResult(name, (val) -> {
            return val.toUpperCase();
        });




        /* Example of (Method reference)
        * Params: String, Interface
        * Here we used Method reference of String Parser Class
        * */

        StringParser stringParser = new StringParser();
        methodReferenceTest.getResult(name, stringParser::print);





       /* Example of (Consumer)
        * Consumer- Means where interface implementation is defined
        * Here we define  Consumer Interface accept method definition
        * and used it at forEach method
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
        e1.setAge(28);

        Emp e2 = new Emp();
        e2.setName("DIP");
        e2.setAge(27);

        List<Emp> empList = Arrays.asList(e, e1, e2);

        empList.stream().forEach(consumer);



        /* Example of (forEach without Consumer explicitly implementation)
        * */

        empList.stream().forEach((a) -> System.out.println(a.getAge()));




         /* Example of (Map & Reduce(Explicitly))
        * Map- Get Function & return Stream, here we implemented Function interface method apply()
        * Reduce- Get BinaryOperator & return Emp obj, here we implemented BinaryOperator interface method apply()
        *
        * */


        Function<Emp, Emp> function = new Function<Emp, Emp>() {
            public Emp apply(Emp emp) {
                String name = emp.getName();
                emp.setName(name + "----");
                return emp;
            }
        };

        BinaryOperator<Emp> binaryOperator = new BinaryOperator<Emp>() {
            public Emp apply(Emp o, Emp o2) {
                Emp emp=new Emp();
                emp.setName(o.getName()+o2.getName());
                emp.setAge(o.getAge()+o2.getAge());
                return emp; // Sum age and concat name
            }
        };

        Emp emp =new Emp();

        Stream<Emp> stream = empList.stream();
        Stream<Emp> stream1 = stream.map(function);
        Emp s2 = stream1.reduce(emp, binaryOperator);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());




         /* Example of (Map & Reduce (Implicitly))
        * Map- Get Function & return Stream, here we implemented Function interface method apply()
        * Reduce- Get BinaryOperator & return Emp obj, here we implemented BinaryOperator interface method apply()
        *
        * */



        Emp emp1 =new Emp();

        stream = empList.stream();
        stream1 = stream.map((a)->{
            a.setName(a.getName() + "----");
            return a;
        });
        s2 = stream1.reduce(emp1, (a,b)->{
            Emp emp3=new Emp();
            emp3.setName(a.getName()+b.getName());
            emp3.setAge(a.getAge()+b.getAge());
            return emp3; // Sum age and concat name
        });
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
