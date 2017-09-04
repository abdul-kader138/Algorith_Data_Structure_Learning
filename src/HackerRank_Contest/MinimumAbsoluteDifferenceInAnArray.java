package HackerRank_Contest;

import java.util.*;


public class MinimumAbsoluteDifferenceInAnArray {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        List<Integer> listObj = new ArrayList<>();

        int c = 1234567891;
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                int val = (arr[i] - arr[j]);
                if (val >= 0) listObj.add(val);
            }
        }
        if (listObj.size() != 0) return Collections.min(listObj);
        else return 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
