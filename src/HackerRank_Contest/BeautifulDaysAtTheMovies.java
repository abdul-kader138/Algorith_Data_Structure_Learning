package HackerRank_Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulDaysAtTheMovies {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();


        System.out.println(buildNumber(s, n, m));

    }


    private static int buildNumber(int s, int e, int d) {
        int value = 0;
        List<Integer> list = new ArrayList<>();
        int difference = e - s;
        int[] ar = new int[difference + 1];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (s + i);
        }

        for (int j = 0; j < ar.length; j++) {
            int val = ar[j];
            String intVal = Integer.toString(val);
            StringBuffer stringBuffer = new StringBuffer(intVal);
            val = Integer.parseInt(stringBuffer.reverse().toString());
            float valueOfExisting = (float) ar[j];
            float valueOfNew = (float) val;
            float result = (valueOfExisting - valueOfNew) / d;
            if (result == (int)result) list.add((int) result);
        }
        value = list.size();

        return value;
    }
}
