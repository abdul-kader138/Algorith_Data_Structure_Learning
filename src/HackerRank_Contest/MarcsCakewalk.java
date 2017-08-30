package HackerRank_Contest;


import java.util.Scanner;

public class MarcsCakewalk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for (int calories_i = 0; calories_i < n; calories_i++) {
            calories[calories_i] = in.nextInt();
        }

        double currentResult=0;
        int startNum=0;
        for(int j=0;j<calories.length;j++){
            if(j==0) currentResult = (0+((n-j)*Math.pow(2,j)));
            else currentResult=(currentResult+((n-j)*Math.pow(2,j)));
        }

        System.out.println(currentResult);
    }
}
