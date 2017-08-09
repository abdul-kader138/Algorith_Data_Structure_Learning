import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int age = 0;
        String name = "";
        double d = 0;
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();
        d = sc.nextDouble();
        sc.nextLine();
        name = sc.nextLine();

        sc.close();
        System.out.println("String: " + name);
        System.out.println("Double: " + d);
        System.out.println("Int: " + age);
    }
}


