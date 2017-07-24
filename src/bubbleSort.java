/**
 * Developer: Abdul Kader
 * Date- 07/23/2017.
 */

public class bubbleSort {

    public static void main(String[] args) {
        int[] list = {31, 3, 43, 72, 18, 21, 44, 46, 98, 87};
        for(int i:list){
            System.out.print(i+"-");
        }

        System.out.println("===============");
        list=bubbleShort(list);

        for(int i:list){
            System.out.print(i+"-");
        }

    }

    private static int[] bubbleShort(int[] obj){
        int temp=0;
        int len=obj.length;

        for(int i=0;i <len;i++){
            for(int j=1;j<len-i;j++){
                if(obj[j-1] > obj[j]){
                    //swap the elements!
                    temp = obj[j-1];
                    obj[j-1] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return obj;
    }
}
