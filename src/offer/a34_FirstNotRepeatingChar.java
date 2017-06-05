package offer;

import java.util.HashMap;

/**
 * Created by jiashilin on 2017/6/5.
 */
public class a34_FirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        //判断特殊情况
        if (str == null) {
            return -1;
        }
        if (str.length() == 1) {
            return 1;
        }
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i <chars.length ; i++) {
            if (map.get(chars[i]) != null) {
                map.put(chars[i],map.get(chars[i])+1);
            }else{
                map.put(chars[i],1);            }
        }
        for (int i = 0; i <chars.length ; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        //如果输入的字符串是“”则返回-1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println( FirstNotRepeatingChar("google"));
    }
}
