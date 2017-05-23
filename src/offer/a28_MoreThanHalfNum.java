package offer;

import java.util.HashMap;


/**
 * Created by jiashilin on 2017/5/23.
 */

public class a28_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length==0) {
            return 0;
        }
        if (array.length==1) {
            return array[0];
        }
        int length = array.length;
        int half = length/2;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <length ; i++) {
            if (map.containsKey(array[i])) {
                if (map.get(array[i])+1>half) {
                    return array[i];
                }
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }

        }
        return 0;

    }

}
