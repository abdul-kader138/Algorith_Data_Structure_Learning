package HackerRank_Contest;


import java.util.*;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    static int equalizeArray(int n, int[] ar) {
        int result = 0;
        int counter = 0;
        Map<Integer, Integer> objList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer count = objList.get(ar[i]);
            objList.put(ar[i], (count == null) ? 1 : count + 1);
        }
        int maxValueInMap = (Collections.max(objList.values()));
        return n-maxValueInMap;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = equalizeArray(n, ar);
        System.out.println(result);
    }
}
