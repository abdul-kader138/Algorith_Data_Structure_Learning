package Searching_Algorithm;

/**
 * Developer: Abdul Kader
 * Date- 07/23/2017.
 */

public class linearSearch {


    public static void main(String[] args) {
        int[] list = {31, 3, 43, 72, 18, 21, 44, 46, 98, 87};
        int t = linearSearch(list, 3);
        System.out.println(t);
    }


    /* binary search example */

    public static int linearSearch(int[] values, int key) {
        for(int i=0; i<=values.length;i++){
            if(key == values[i]) return i;
        }
        return -1;
    }

}
