package HackerRank_Contest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BankAccounts {
    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        List<Integer> obj=new ArrayList<>();
        int fees = 0;
        int fees1 = 0;
        for (int j = 0; j < n; j++) {
            fees=0;
            fees += (n * k);
            fees += (n* x);
            obj.add(fees);
        }

        int maxVal= Collections.max(obj);
        if (maxVal > d) return "upfront";
        else return "fee";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for (int p_i = 0; p_i < n; p_i++) {
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }

}
