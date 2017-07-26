import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetProblemSolve {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        HashSet<String> nameList=new HashSet<String>();
        List<Integer> num=new ArrayList<Integer>();
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        for (int j = 0; j < t; j++) {
            nameList.add(pair_left[j] + " " + pair_right[j]);
            num.add(nameList.size());
        }
        for(int k:num){
            System.out.println(k);
        }
    }
}
