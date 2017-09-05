package HackerRank_Contest;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];

        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        Map<String, Integer> objList = new HashMap<>();

        for (int j = 0; j < arr.length; j++) {
            objList.put("" + (j + 1), arr[j]);
        }


        for (int i = 0; i < arr.length; i++) {

            int loop = (i + 1);
            int fR = 0;
            for (Map.Entry t : objList.entrySet()) {
                if (loop == (int) t.getValue()) {
                    fR = Integer.parseInt((String) t.getKey());
                }
            }
            int result = Arrays.asList(arr).indexOf(fR);
            System.out.println((result + 1));
        }

    }


}
