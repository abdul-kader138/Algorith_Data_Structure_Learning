package HackerRank_Contest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        List<Integer> numberList = new ArrayList<>();
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        for(int val:height) numberList.add(val);
        int maxNum = Collections.max(numberList);
        int result = 0;
        if (maxNum > k) result = maxNum - k;
        System.out.println(result);
    }
}
