package HackerRank_Contest;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int len = S.trim().length();
        String findString = "SOS";
        Pattern p = Pattern.compile(findString);
        Matcher m = p.matcher(S.trim());
        int count = 0;
        while (m.find()) {
            count += 1;
        }

        int wordLength = len / 3;
        int mainString = wordLength - count;
        if (mainString > 0) {
            System.out.println(mainString * 3);
        } else System.out.println(0);

        System.out.println(len);
        System.out.println(count);
    }
}
