package offer;

/**
 * Created by jiashilin on 2017/6/9.
 */
//约瑟夫问题
public class a46_LastRemaining {
    //推导规律实现
    public int LastRemaining(int n, int m) {
        if (n<1||m<1){
            return -1;
        }

        int position = 0;
        for (int i = 2; i <=n ; i++) {
            position = (position+m)%i;
        }
        return position;

    }
}
