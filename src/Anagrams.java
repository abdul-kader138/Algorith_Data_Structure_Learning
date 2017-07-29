import java.util.Arrays;
import java.util.Scanner;

/**
 * Developer: Abdul Kader
 * Date- 07/29/2017.
 *
 * Two strings,a and b, are called anagrams
 * if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 *
 **/

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char[] words1=a.toUpperCase().toCharArray();
        StringBuilder sbSecond = new StringBuilder(b.toUpperCase());
        for(char ch : words1){
            int index=sbSecond.indexOf(""+ch);
            if(index != -1) sbSecond.deleteCharAt(index);
            else return false;
        }
        return sbSecond.length()==0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
