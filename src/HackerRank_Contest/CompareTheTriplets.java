package HackerRank_Contest;

import java.util.Scanner;

public class CompareTheTriplets {


    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int aPoint = 0;
        int bPoint = 0;
        if (a0 > b0) aPoint += 1;
        if (a0 < b0) bPoint += 1;
        if (a1 > b1) aPoint += 1;
        if (a1 < b1) bPoint += 1;
        if (a2 > b2) aPoint += 1;
        if (a2 < b2) bPoint += 1;
        int[] result = new int[2];
        result[0] = aPoint;
        result[1] = bPoint;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
