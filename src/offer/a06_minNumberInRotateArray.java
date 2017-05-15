package offer;

import java.util.Random;

/**
 * Created by jiashilin on 2017/5/14.
 */
public class a06_minNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        //判断特殊情况
        if (array == null) {
            return 0;
        }
        if (array.length==1) {
            return array[0];
        }
        //获取做指针和右指针，以及中间数mid
        int length = array.length;
        int left = 0;
        int right =length-1;
        int mid = (right+left)/2;
        //根据不同情况的处理
        for (; right-left>1 ;) {
            if (array[mid] < array[right] ) {
                right = mid;
                mid = (right+left)/2;
            }else if (array[mid] > array[right]){
                left = mid;
                mid = (right+left)/2;
            }else{//当mid=right时，rightz左移一位
                right--;
            }
        }
        return Math.min(array[left],array[right]);
    }

    public static void main(String[] args) {
        int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        System.out.println(minNumberInRotateArray(array));
    }

}
