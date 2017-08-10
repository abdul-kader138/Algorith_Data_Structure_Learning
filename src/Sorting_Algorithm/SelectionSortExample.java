package Sorting_Algorithm;

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

            /* Check current element with sub set array  */
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[index]) {
                    index = j;
                }
            }

             /* if current element is greater than  sub set array ,
             swap current element with subset array lowest element */
            int temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }


        for (int val : list) System.out.println(val);
    }


    public static void main(String[] args) {
        int[] valueList = {5, 1, 15, -5, 16, 2, 12, 14};
        selectionSort(valueList);
    }
}
