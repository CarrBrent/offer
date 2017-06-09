package offer;

/**
 * Created by jiashilin on 2017/6/8.
 */
public class a45_isContinuous {
    public static boolean isContinuous(int [] numbers) {
        if (numbers == null||numbers.length!=5) {
            return false;
        }

        quckSort(numbers,0,numbers.length-1);
        int count =0;
        int differ=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == 0) {
                count ++;
            }
        }
        if (count == 4) {
            return true;
        }else if (count >4){
            return false;
        }else{
            for (int i = count; i <numbers.length-1 ; i++) {
                //出现对子就返回fasle
                if (numbers[i+1]-numbers[i]==0) {
                    return false;
                }
                //没有对子的情况下，计算中间的差值
                differ += numbers[i+1]-numbers[i] -1;
            }
        }
        //零的个数可以满足差值的认为是顺子
        if (differ <= count) {
            return true;
        }else{
            return false;
        }
    }
    private static void quckSort(int[] numbers, int begin,int end){
        if (begin >= end) {
            return;
        }
        int flag = numbers[begin];
        int position = begin;
        for (int i = begin+1; i <=end ; i++) {
            if (numbers[i]<flag) {
                int tmp =numbers[i];
                for (int j = i; j >position ; j--) {
                    numbers[j]=numbers[j-1];
                }
                numbers[position] = tmp;
                position ++;
            }
        }
        quckSort(numbers,begin,position-1);
        quckSort(numbers,position+1,end);

    }

    public static void main(String[] args) {
        int[] numbers ={0,1,3,6,4};
        isContinuous(numbers);
    }
}
