/**
 * Developer: Abdul Kader
 * Date- 07/24/2017.
 */


/*
* In bubble sort, when sorting
* then comparison with next
* element if next element small
* then swap it with current element
* */



public class bubbleSort {

    public static void main(String[] args) {
        int[] list = {31, 3, 43, 72, 18, 21, 44, 46, 98, 87};
        for (int i : list) {
            System.out.print(i + "-");
        }
        System.out.println("===============");
        list = bubbleShort(list);

        for (int i : list) {
            System.out.print(i + "-");
        }

    }

    private static int[] bubbleShort(int[] obj) {
        int temp = 0;
        int len = obj.length;

        // int[] list = {31, 3, 43, 72, 18, 21, 44, 46, 98, 87};

        for (int i = 0; i <= len; i++) {
            // start compare for first index(i=31)

            /*
            * For every loop its swap array first to last so that loop at inner loop we used j < len - i
            * */

            for (int j = 1; j < len - i; j++) {

                // Doing value swap at whole array  for i index
                if (obj[j - 1] > obj[j]) {
                    temp = obj[j - 1];
                    obj[j - 1] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return obj;
    }
}
