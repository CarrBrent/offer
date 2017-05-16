package offer;

/**
 * Created by jiashilin on 2017/5/16.
 */
public class a13_reOrderArray {
    public static void reOrderArray(int [] array) {
        if (array == null || array.length==1) {
            return;
        }
        int length = array.length;
        int[] array1 = new int[length];
        for (int i = 0,j=0 ; i <length;i++) {
            if (array[i] %2==1) {
                array1[j]=array[i];
                j++;
            }
        }
        for (int i = length-1 ,j= length-1; i >=0 ; i--) {
            if (array[i] % 2 == 0) {
                array1[j] = array[i];
                j--;
            }
        }
        //array=array1;标准模式下不予许这样做
        System.arraycopy(array1,0,array,0,length);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
    }

}
