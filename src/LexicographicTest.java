/**
 * Developer: Abdul Kader
 * Date- 07/29/2017.
 **/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicTest {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str = sc.nextLine();
        System.out.println("Enter the length");
        int count = sc.nextInt();
        List<String> list = new ArrayList<String>();

        /*
        * (str.length() - i >= count) we check until length small then count for per fetch
        * and substring to current index to count+current index
        * then add substring value to list
        */

        for (int i = 0; i < str.length(); i = i + 1) {
            if (str.length() - i >= count) {
                list.add(str.substring(i, count + i));
            }
        }
        Collections.sort(list);
        System.out.println("Smallest subString:-" + list.get(0));
        System.out.println("Largest subString:-" + list.get(list.size() - 1));
    }
}
