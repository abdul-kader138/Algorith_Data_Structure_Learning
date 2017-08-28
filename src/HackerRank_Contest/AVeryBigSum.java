package HackerRank_Contest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by a.kader on 8/28/2017.
 */
public class AVeryBigSum {
    static long aVeryBigSum(int n, long[] ar) {
        long sum=0l;
        for(int j=0;j<ar.length;j++) sum+=ar[j];
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
