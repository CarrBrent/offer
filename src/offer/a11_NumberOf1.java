package offer;

/**
 * Created by jiashilin on 2017/5/15.
 */
public class a11_NumberOf1 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n!=0){
            n = n &(n-1);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(9));
    }
}
