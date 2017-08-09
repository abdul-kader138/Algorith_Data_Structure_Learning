/**
 * Developer: Abdul Kader
 * Date-8/9/2017.
 */


/*
* In Selection sort, when sorting
* then create a subset without current element
* and compare current element and subset array's
* next small element and swap it with current element
* */

public class SelectionSortExample {

    public static void selectionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[index]) {
                    index = j;
                }
            }
            int temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }


        for (int val : list) System.out.println(val);
    }


    public static void main(String[] args) {
        int[] valueList = {9, 14, 3, 2, 43, 11, 58, 22};
        selectionSort(valueList);
    }
}
