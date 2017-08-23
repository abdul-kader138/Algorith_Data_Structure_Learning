package HackerRank_Contest;


import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }


        System.out.println(countStep(c));
    }


    private static int countStep(int[] obj) {
        int jump = 0;
        int currentVal = 0;
        int previousVAl = 0;
        int nextVAl = 0;
        for (int j = 1; j < obj.length; j++) {
            if (currentVal == obj[j] && obj[j] == 0) jump += 1;
            if (checkNextNumber(obj, j, (j + 1))) jump -= 1;
        }
        return jump;
    }


    private static boolean checkNextNumber(int[] valueList, int currentIndex, int nextIndex) {
        if (nextIndex < valueList.length && valueList[currentIndex] == valueList[nextIndex] && valueList[currentIndex] == 0)
            return true;
        return false;
    }
}
