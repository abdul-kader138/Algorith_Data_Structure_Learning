package HackerRank_Contest;


import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        System.out.println(countMountain(n, s));
    }


    public static int countMountain(int n, String s) {
        int level = 0;
        int result = 0;
        int up = 0;
        int down = 0;
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if ('U' == values[i]) up += 1;
            if ('D' == values[i]) down += 1;
            if (level == (up - down) && up > 3 && down > 3) {
                result += 1;
                up = 0;
                down = 0;
            }
        }

        return result;
    }

}
