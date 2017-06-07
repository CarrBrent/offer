package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/6/7.
 */
public class a42_FindNumbersWithSum {
    public ArrayList<Integer>  FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int product = sum*sum;
        int left = 0;
        int right = array.length-1;
        while (left<right)
        {
            if (array[left]+array[right] == sum) {
                if (array[left]*array[right]<product) {
                    result.add(array[left]);
                    result.add(array[right]);
                    product = array[left]*array[right];
                    left++;
                    right--;
                }else{
                    left++;
                    right--;
                }
            }else if(array[left]+array[right] < sum){
                left++;
            }else {
                right--;
            }

        }
        return result;


    }
}
