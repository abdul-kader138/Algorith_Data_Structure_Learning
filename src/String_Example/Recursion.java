package String_Example;

/**
 * Developer: Abdul Kader
 * Date- 07/24/2017.
 * Reverse String using recursion
 */

public class Recursion {
    public static void main(String[] args) {
        System.out.println(reverseString("Abdul kader"));
    }

    private static String reverseString(String args) {
        if (args == null || args.length() < 1 || args.length() == 1) return args;
        else{
        return args.charAt(args.length()-1) + reverseString(args.substring(0,args.length() - 1));
        }
    }
}
