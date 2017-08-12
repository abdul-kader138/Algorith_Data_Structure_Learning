package HackerRank_Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by a.kader on 8/12/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        List<Long> values = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            values.add(addingNumber(arr[j], arr));
        }

        if (values.size() != 0 && Collections.min(values) != 0 && Collections.max(values) != 0) {
            System.out.println(Collections.min(values) + " " + Collections.max(values));
        } else {
            Long minMinimal = addingForNumber(0, arr.length - 1, arr);
            Long maxMinimal = addingForNumber(1, arr.length, arr);
            System.out.println(minMinimal + " " + maxMinimal);

        }


    }

    private static long addingNumber(int exceptVal, int[] obj) {
        long number = 0;
        int counter = 0;
        for (int i = 0; i < obj.length; i++) {
            if (exceptVal != obj[i]) {
                number += obj[i];
            }
        }
        return number;
    }

    private static long addingForNumber(int start, int length, int[] obj) {
        long number = 0;
        for (int i = start; i < length; i++) {
            number += obj[i];
        }
        return number;
    }

}
