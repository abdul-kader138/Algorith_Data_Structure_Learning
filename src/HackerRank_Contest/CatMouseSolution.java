package HackerRank_Contest;


import java.util.Scanner;

public class CatMouseSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            printLocation(x, y, z);
        }
    }

    private static void printLocation(int a, int b, int c) {

        // 1 2 3
        // 1 3 2
        // 2 1 3

        int subtractCA = (c - a) ;
        int subtractCB = (c - b);

        if(subtractCA<0) subtractCA=subtractCA*(-1);
        if(subtractCB<0) subtractCB=subtractCB*(-1);
        System.out.println("C-A # " + subtractCA);
        System.out.println("C-B # " + subtractCB);
        if (subtractCA < subtractCB && subtractCA >= 0) System.out.println("Cat A");
        if (subtractCA > subtractCB && subtractCB >= 0) System.out.println("Cat B");
        if (subtractCA == subtractCB) System.out.println("Mouse C");


    }


}
