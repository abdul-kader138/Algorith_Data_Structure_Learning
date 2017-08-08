import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            // Check for subsequences of input that match the compiled pattern
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
