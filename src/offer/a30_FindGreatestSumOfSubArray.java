package offer;

/**
 * Created by jiashilin on 2017/5/31.
 * 连续子数组的最大和
 */
public class a30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length==0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int sum = 0;
        int maxSum = array[0];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (sum <=0 ) {
                sum = array[i];

            }else {
                sum = sum+array[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        return maxSum;

    }
}
