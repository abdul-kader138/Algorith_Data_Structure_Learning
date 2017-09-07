package Lambda;

import java.util.Stack;


public class App {

    public static void main(String [] args){



        String name="Hello World";

        /*
        * Params: String, Interface
        * Here we used the power of Lambda and implementing interface using Lambda
        *
        *
        *
        * */
        MethodReferenceTest methodReferenceTest=new MethodReferenceTest();
        methodReferenceTest.getResult(name,(val)->{
            return val.toUpperCase();
        });


    }
}
