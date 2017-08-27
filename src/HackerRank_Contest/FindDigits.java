package HackerRank_Contest;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] a = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            a[a0] = n;
        }
        findNumber(a);
    }


    private static void findNumber(int[] c) {
        for (int j = 0; j < c.length; j++) {
            int result = 0;
            String s = String.valueOf(c[j]);
            char[] d = s.toCharArray();
            for (int k = 0; k < d.length; k++) {
                int val = Integer.parseInt("" + d[k]);
                if (val != 0) {
                    if (c[j] % val == 0) result += 1;
                }
            }
            System.out.println(result);
        }
    }
}
