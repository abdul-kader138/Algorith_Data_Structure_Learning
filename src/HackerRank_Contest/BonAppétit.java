package HackerRank_Contest;


import java.util.Scanner;

public class BonAppétit {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        int annaBill=ar[k];
        int totalBill=0;
        for(int i=0; i<ar.length;i++){
            if(i !=k) totalBill+=ar[i];
        }
        totalBill=totalBill/2;
        totalBill=b-totalBill;
        if(totalBill == 0) System.out.println("Bon Appetit");
        else System.out.println(totalBill);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}
