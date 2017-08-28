package HackerRank_Contest;


import java.util.Scanner;

public class DrawingBook {

    static int solve(int n, int p) {
        int firstForward = 0;
        int backWard = 0;
        boolean even=isEven(p);
        if(even){
            for(int i=2;i<=p;i+=2){
                firstForward+=1;
            }
            for(int i=p;i>=p;i-=2){
                backWard+=1;
            }
        }
        else{
            for(int i=1;i<=p;i+=2){
                firstForward+=1;
            }
            for(int i=p;i>=p;i-=1){
                backWard+=1;
            }
        }

        if (n == p) return 0;
        if (firstForward < backWard) return firstForward;
        else return backWard;
    }


    private static boolean isEven(int num) {
        boolean even = true;
        if (num % 2 == 0) return even;
        else return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
