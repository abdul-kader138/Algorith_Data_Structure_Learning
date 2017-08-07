import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countValid = 0;
        int countInvalid = 0;
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
//            String regex = "^[a-zA-Z0-9_]*$";
            String regex = "^[A-Za-z][A-Za-z0-9_]{7,29}/*$";
            Pattern r = Pattern.compile(regex);
            Matcher m = r.matcher(username);
            if (m.find()) {
                System.out.println("Valid");
                countValid++;
            } else {
                System.out.println("Invalid");
                countInvalid++;
            }
            testCases--;
        }

        System.out.println(countValid);
        System.out.println(countInvalid);
    }
}
