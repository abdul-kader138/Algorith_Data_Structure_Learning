import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
* Still not resolve- Hacker Rank Problem
*
*
*
* */

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        in.nextLine();
        String stringArray = in.nextLine();
        int n = in.nextInt();
        in.nextLine();
        List<Integer> list = new ArrayList<Integer>(index);
        List<Integer> finalList = new ArrayList<Integer>(index);


        // add list value
        if (!stringArray.equals("")) {
            String[] listVal = stringArray.split(" ");
            finalList = new ArrayList<Integer>(index);
            for (int i = 0; i < index; i++) {
                list.add(Integer.parseInt(listVal[i]));
            }
        }


        for (int z = 0; z < n; z++) {
            String value = in.next();
            in.nextLine();
            String valueList = in.nextLine();
            if (!valueList.equals("")) {
                    String[] insertIndex = valueList.split(" ");
                    int[] insertIndexVal = new int[insertIndex.length];
                    for (int q = 0; q < insertIndex.length; q++) {
                        insertIndexVal[q] = Integer.parseInt(insertIndex[q]);
                    }
                    if (value.equals("Insert")) finalList = addToArray(list, insertIndexVal);
                    if (value.equals("Delete")) finalList = removeToArray(list, insertIndexVal);
                }
        }

        String finalVal = "";
        if (finalList.size() > 0) {
            for (int val : finalList) {
                finalVal += val + " ";
            }
        }
        System.out.println(finalVal.trim());


    }

    private static List<Integer> addToArray(List<Integer> list, int[] indexVal) {
        list.add(indexVal[0], indexVal[1]);
        return list;
    }

    private static List<Integer> removeToArray(List<Integer> list, int[] indexVal) {
        list.remove(indexVal[0]);
        return list;
    }
}

