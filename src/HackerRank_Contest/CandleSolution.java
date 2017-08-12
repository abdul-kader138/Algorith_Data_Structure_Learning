package HackerRank_Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class CandleSolution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int number = 0;
        List<Integer> numberList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numberList.add(ar[i]);
        }

        int maxNumber= Collections.max(numberList);

        for(int j = 0; j < n; j++){
            if(maxNumber == ar[j]) number +=1;
        }
        return number;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
