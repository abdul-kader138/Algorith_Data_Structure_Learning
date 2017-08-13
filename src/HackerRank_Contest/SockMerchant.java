package HackerRank_Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> objList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer count = objList.get(ar[i]);
            objList.put(ar[i], (count == null) ? 1 : count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : objList.entrySet()) {
            int value = entry.getValue();
            if (value > 0) {
                int pairs = (int) value / 2;
                if (pairs > 0) result += pairs;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
