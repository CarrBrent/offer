package offer;

/**
 * Created by jiashilin on 2017/5/15.
 */
//一般求斐波那契数列的思路会想到递归，但是在求解的过程中会用到过多的重复计算。1,1,2,3,5,8
//因此只要将之前的计算结果存储起来就能达到提高效率的效果。
public class a07_Fibonacci {
    public int Fibonacci(int n) {
        //判断特殊情况
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        //n>2的情况
        int[] fibonacci = new int[n];
        fibonacci[0]=1;
        fibonacci[1]=1;
        for (int i = 2; i <n ; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci[n-1];
    }
}
