package HackerRank_Contest;


import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String[] x = s.split("(?=[A-Z])");
        System.out.println(x.length);
    }
}
