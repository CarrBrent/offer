package offer;

/**
 * Created by jiashilin on 2017/5/15.
 */
public class a10_RectCover {
    public int RectCover(int n ) {
        //判断特殊情况
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        //n>2的情况
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 3; i <=n ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;

    }

}
