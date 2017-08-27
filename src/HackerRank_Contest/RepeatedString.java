package HackerRank_Contest;

import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = 0;
        String stringBuilder = "";
        if (n < 1000000000000l) {
            Pattern p = Pattern.compile("a");
            Matcher m = p.matcher(s);
            if (m.find()) {
                int lop = (int) (n / (long) s.length());
                for (long i = 0; i <= n; i++) {
                    if ((long) stringBuilder.length() == n) break;
                    long mainLen = stringBuilder.length() + s.length();
                    if (mainLen < n) stringBuilder = stringBuilder + s;
                    else {
                        long len = n - stringBuilder.length();
                        if (len > 0) {
                            String out = s.substring(0, (int) len);
                            stringBuilder = stringBuilder + out;
                        }
                    }

                }
                Pattern p1 = Pattern.compile("a");
                Matcher m1 = p1.matcher(stringBuilder);
                while (m1.find()) result += 1;
            }

        } else result = n;

        System.out.println(result);

//        System.out.println((long) stringBuilder.length());
//        System.out.println(n);


    }
}
