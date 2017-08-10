package Searching_Algorithm;

/**
 * Developer: Abdul Kader
 * Date- 07/23/2017.
 **/


/*
*  for binary search, search list/array must be sorted otherwise it's not working as expected.
* */

public class binarySearch {

    public static void main(String[] args) {
        int[] list = {31, 3, 43, 72, 18, 21, 44, 46, 98, 87};
        list=arrayShort(list);
        int t = binarySearch(list, 21);
        System.out.println(t);
    }


    /* binary search example */

    public static int binarySearch(int[] values, int key) {
        int start = 0;
        int end = values.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (key == values[middle]) {
                return middle;
            }
            if (key < values[middle]) {
                end = middle - 1;   // decrease end value if search value less then middle value

            } else {
                start = middle + 1; // increase start value if search value greater then middle value
            }
        }
        return -1;
    }


    /* Sort array without using Java API */

    public static int[] arrayShort(int[] obj) {
        for (int i = 0; i <= obj.length; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                int temp = 0;
                if (obj[i] > obj[j]) {
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return obj;
    }
}
