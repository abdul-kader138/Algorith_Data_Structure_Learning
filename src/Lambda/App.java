package Lambda;

import java.util.Stack;


public class App {

    public static void main(String [] args){


        Employee employee=new Employee();

        employee.setAge(30);
        employee.setName("Abdul Kader");
        employee.setSalary(40000);

        Employee employee1=new Employee();
        employee1.setAge(30);
        employee1.setName("Boss-1");
        employee1.setSalary(30000);

        Employee employee2=new Employee();
        employee2.setAge(40);
        employee2.setName("Boss-2");
        employee2.setSalary(50000);

        Stack<Employee> stack=new Stack<>();
        stack.add(employee);
        stack.add(employee1);
        stack.add(employee2);


//        List<Employee> list=stack.stream().filter((t) -> t.getAge() > 29);
        double totalSalary=stack.stream().filter((t) -> t.getAge() > 29).mapToDouble(t -> t.getSalary()).sum();
        System.out.println(totalSalary);


    }
}
