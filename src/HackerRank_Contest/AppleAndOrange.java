package HackerRank_Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        // Start Solution from here
        int countApple=0;
        int countOrange=0;
        List<Integer> appleList=new ArrayList<>();
        List<Integer> orangeList=new ArrayList<>();
        for(int i=0;i<apple.length;i++)appleList.add(a+apple[i]);
        for(int j=0;j<orange.length;j++)orangeList.add(b+orange[j]);

        for(int ap:appleList){
            if(ap>=s && ap<=t) countApple+=1;
        }
        for(int or:orangeList){
            if(or>=s && or<=t) countOrange+=1;
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }


}
