package Lambda;


import java8.*;

public class MethodReferenceTest {

    void getResult(String s, java8.Parser p){
        String s1=p.show(s);
        System.out.println(s1);
    }
}
