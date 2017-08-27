package HackerRank_Contest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        Pattern p = Pattern.compile("a");
        long count = 0;
        long count2 = 0;

        /* Find number of match a from given String */
        Matcher m = p.matcher(s);
        while (m.find()) count += 1;

        /* Calculate how many time big output will create from given string */
        long wordLen=(long)s.length();
        long divisor=(n/wordLen);
        long totalDiff=(n-(divisor*wordLen));

        /* If need to spilt then substring main string */
        String subLength=s.substring(0,(int) totalDiff);
        Matcher m1 = p.matcher(subLength);
        while (m1.find()) count2 += 1;

        /* Final output  */
        long result=((count*divisor)+count2);
        System.out.println(result);

    }
}
