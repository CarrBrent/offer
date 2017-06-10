package offer;

/**
 * Created by jiashilin on 2017/6/10.
 */
public class a48_Add {
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}
