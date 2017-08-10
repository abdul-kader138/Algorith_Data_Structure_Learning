package String_Example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class PalindromeTest {

    public static void main(String[] args) throws ParseException {
        String val="madam";
        if (isPalindrome(val)) System.out.println("Yes");
        else System.out.println("No");



    }



    /*
     * First compare index 0 value with index last value, if not match then return false
     * if match then recursion happen
     */
    private static boolean isPalindrome(String s) {
        int length = s.length();
        if (length < 2) return true; // validate last value/single value so that recursion stop.(i.e d)
        else {
            System.out.println(s);
            System.out.println(s.charAt(length - 1));
        return s.charAt(0) != s.charAt(length - 1) ? false :isPalindrome(s.substring(1, length - 1));
        }
    }

}
