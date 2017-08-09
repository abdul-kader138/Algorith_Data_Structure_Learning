import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        int arrayLength=s.length-2;




        String[] s2=new String[n];

        for(int w=0; w<n;w++) s2[w]=s[w];

        Arrays.sort(s2, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));

        for(int w=0; w<n;w++) s[w]=s2[w];
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }


}
