import java.security.Permission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class SeriesCalculation {

    public static void main(String[] argh) {
        List<Long> addToList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            createSeries(a,b,n);
        }
        in.close();
    }

    public static long createSeries(int start, int addFloat,int loop) {

        Long fructionValue = new Long(addFloat);
        Long startValue = new Long(start);
        long val = startValue + fructionValue;
        long vale;

        for(int i=1;i<=loop;i++){
            vale=pow(addFloat, i);
            System.out.println(vale);
        }
        return new Long(1);
    }

    public static long pow(long a, int b) {
        {
            if (b == 0) return 1;
            if (b == 1) return a;
            if ((b % 2) == 0) return pow(a * a, b / 2); //even a=(a^2)^b/2
            else return a * pow(a * a, b / 2); //odd  a=a*(a^2)^b/2

        }

    }

}
