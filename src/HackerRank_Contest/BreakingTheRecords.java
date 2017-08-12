package HackerRank_Contest;

import java.util.*;

/**
 * Created by a.kader on 8/12/2017.
 */
public class BreakingTheRecords {

    static int[] getRecord(int[] s) {
        Set<Integer> objListMax=new HashSet<>();
        Set<Integer> objListMin=new HashSet<>();
        int[] values = new int[2];
        int maxVal = s[0];
        int minVal = s[0];
        int maxNum=0;
        int minNum=minVal;

        for (int i = 1; i < s.length; i++) {
            if(objListMax.size() !=0)maxNum=Collections.max(objListMax);
            if(objListMin.size() !=0)minNum=Collections.min(objListMin);
            if (s[i] > maxVal && s[i]>maxNum) objListMax.add(s[i]);
            if (s[i] < minVal && s[i]<minNum) objListMin.add(s[i]);
        }

        values[0] = objListMax.size();
        values[1] = objListMin.size();

        return values;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
