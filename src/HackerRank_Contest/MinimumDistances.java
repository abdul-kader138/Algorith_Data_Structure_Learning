package HackerRank_Contest;


import java.util.*;

public class MinimumDistances {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer A[] = new Integer[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }

        getValue(A);
    }


    private static void getValue(Integer[] obj) {
        Map<Integer, Integer> valueList = new HashMap<>();

        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length; j++) {
                int previousValue = 0;
                if (i != j) {
                    if (valueList.size() > 0) previousValue = ((valueList.get(obj[j])!=null) ? valueList.get(obj[j]):0);

                    if (obj[i] == obj[j] && previousValue < j && previousValue >-1) {
                        valueList.put(obj[j], j);
                    }
                }
            }
        }


        List<Integer> indexList = Arrays.asList(obj);
        List<Integer> minValObj = new ArrayList<>();

        for (Map.Entry val : valueList.entrySet()) {
            int index = indexList.indexOf((int) val.getKey());
            minValObj.add(((int) val.getValue() - index));
        }

        if (minValObj.size() == 0) System.out.println(-1);
        else System.out.println(Collections.min(minValObj));


    }
}
