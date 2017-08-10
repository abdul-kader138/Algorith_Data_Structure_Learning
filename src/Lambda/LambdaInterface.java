package Lambda;

import java.lang.annotation.*;
import java.util.function.Predicate;

@FunctionalInterface
public interface LambdaInterface<F,T> {
//    public int add(int... a);

    T valueOfInteger(F f);

    default void test(){
        System.out.println("Testing");
    }

    @Documented
    @Target(ElementType.METHOD)
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @interface CustomAnnotation {
        String name() default "Abdul Kader";
        int age() default 30;
    }

    class EmployeePredicates {


        public static Predicate<LambdaTest.Employee> isStartWith1(){
            return p->p.getName().startsWith("1");
        }

        public static Predicate<LambdaTest.Employee> isStartWith2(){
            return p->p.getName().startsWith("2");
        }
    }
}
