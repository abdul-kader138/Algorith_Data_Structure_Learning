package HackerRank_Contest;


import java.util.Scanner;

public class DrawingBook {


    static int solve(int n, int p) {
        if(n==p) return 0;
        int firstForward = p - 1;
        int backWard = ((n - p)-1);
        if (firstForward < backWard) return firstForward;
        else return backWard;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
