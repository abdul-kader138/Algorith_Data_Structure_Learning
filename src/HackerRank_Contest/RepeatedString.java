package HackerRank_Contest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = 0;
        if (n < Integer.MAX_VALUE) {
            Pattern p = Pattern.compile("a");
            Matcher m = p.matcher(s);
            if (m.find()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (long i = 0; i < n; i++) {
                    long mainLen = (long) stringBuilder.length() + (long) s.length();
                    if (mainLen < n) stringBuilder.append(s);
                    else {
                        long len = (long) n - stringBuilder.length();
                        if (len > 0) {
                            String out = s.substring(0, (int) len);
                            stringBuilder.append(out);
                            break;
                        }
                    }


                }
                Pattern p1 = Pattern.compile("a");
                Matcher m1 = p.matcher(stringBuilder);
                while (m1.find()) result += 1;
            }

        }

        System.out.println(result);


    }
}
