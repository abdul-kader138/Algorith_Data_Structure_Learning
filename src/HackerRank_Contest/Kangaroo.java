package HackerRank_Contest;


import java.util.Scanner;

public class Kangaroo {


    static String kangaroo(int x1, int v1, int x2, int v2) {
        int differenceThem=x2-x1;
        int firstVal=x1;
        int lastVal=x2;
        for(int i=0;i<differenceThem;i++){
            firstVal+=v1;
            lastVal+=v2;
        }
//        System.out.println(firstVal);
//        System.out.println(lastVal);
        if(firstVal==lastVal) return "YES";
        else return  "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
