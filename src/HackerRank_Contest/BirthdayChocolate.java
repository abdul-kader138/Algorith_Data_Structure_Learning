package HackerRank_Contest;


import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if ((i + m) <= n) {
                int result = getNextNumber(i, m, s);
                if (result == d) count += 1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }


    private static int getNextNumber(int index, int consecutiveNum, int[] ar) {
        int sum = ar[index];
        int addIndex = 1;

        if (consecutiveNum < 2) return sum;
        else {
            while (addIndex < consecutiveNum) {
                sum += ar[(index + addIndex)];
                addIndex++;
            }
            return sum;
        }
    }
}
