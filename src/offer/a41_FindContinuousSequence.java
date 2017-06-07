package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/6/7.
 */
public class a41_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) {
            return result;
        }
        int small = 1;
        int big = 2;
        while (big<=sum/2+1){
            int num = getSum(small,big);
            if (num == sum) {
                addToResult(result,small,big);
                big++;
            }else if (num <sum){
                big++;
            }else {
                small++;
            }
        }
        return result;

    }
    private int getSum(int small,int big){
        int sum = 0;
        for (int i = small; i <=big ; i++) {
            sum+=i;
        }
        return sum;
    }
    private  void addToResult(ArrayList<ArrayList<Integer>> result, int small, int big){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = small; i <=big ; i++) {
            array.add(i);
        }
        result.add(array);
    }
}
