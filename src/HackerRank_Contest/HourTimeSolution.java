package HackerRank_Contest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by a.kader on 8/12/2017.
 */
public class HourTimeSolution {


    static String timeConversion(String s) {
        String s1=s.substring(0,8);
        String s2=s.substring(8);
        String input = s1+" "+s2;
        DateFormat df = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
            date= df.parse(input);
            output = outputFormat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
