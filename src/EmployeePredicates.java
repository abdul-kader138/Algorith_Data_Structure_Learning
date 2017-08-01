import java.util.function.Predicate;

public class EmployeePredicates {


    public static Predicate<Employee> isStartWith1(){
        return p->p.getName().startsWith("1");
    }

    public static Predicate<Employee> isStartWith2(){
        return p->p.getName().startsWith("2");
    }
}
