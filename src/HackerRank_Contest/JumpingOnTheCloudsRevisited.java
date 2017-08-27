package HackerRank_Contest;


import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int energy=100;
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        for(int j=0;j<c.length;j+=k) {
            if(c[j]==0) energy-=1;
            if(c[j]==1) energy-=3;
//            System.out.println(c[j]);
        }
        System.out.println(energy);

    }
}
