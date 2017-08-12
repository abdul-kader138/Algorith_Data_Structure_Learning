package HackerRank_Contest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by a.kader on 8/12/2017.
 */
public class MigratoryBirds {


    public static void printMap(Map<Integer, Integer> map) {

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }

    }


    static int migratoryBirds(int n, Integer[] ar) {
        List<Integer> list = Arrays.asList(ar);
        int value=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        int maxVal=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() ==maxVal){
                value=entry.getKey();
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
