package offer;

/**
 * Created by jiashilin on 2017/5/15.
 */

public class a09_JumpFloor2 {
    public static  int JumpFloorII(int target) {
        if (target<1) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        //通过位移计算2的次幂。但是计算2^0的时候需要单独计算。
        return 2 <<(target-2);

    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(1));
        System.out.println(2<<0);
        System.out.println(2<<1);
        System.out.println(2<<2);
    }
}
