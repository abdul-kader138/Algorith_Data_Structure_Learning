package HackerRank_Contest;


import java.util.Scanner;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter+=addingNumber(i+1,n,i,ar,k);
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

    private static int addingNumber(int start,int len,int current,int[]s,int divi){
        int result=0;
        for (int j = start; j < len; j++) {
                int value = s[current] + s[j];
                if (value % divi == 0) {
                    result += 1;
                }
            }
        return result;
        }

}
