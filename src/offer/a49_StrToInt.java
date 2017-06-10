package offer;

/**
 * Created by jiashilin on 2017/6/10.
 */
//将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
// 数值为0或者字符串不是一个合法的数值则返回0
public class a49_StrToInt {
    public static int StrToInt(String str) {
        //判断特殊情况
        //1.字符串为空
        if (str == null || str.length() == 0) {
            return 0;
        }
        //2.字符串只有一个+-号
        char[] chars = str.toCharArray();
        if (str.length() == 1 && (chars[0] == '+' || chars[0] == '-')) {
            return 0;
        }
       int result = 0;
        //边计算边判断每个字符是不是合法
        int i=0;
        if (chars[0] == '+' || chars[0] == '-') {
            i++;
        }
        for (; i < chars.length; i++) {
            if (chars[i] - '0' < 0 || chars[i] - '0' > 9) {
                return 0;
            }
            result = result*10 + (chars[i] - '0');
            //判断是否溢出
            if ((i<chars.length-1&&chars[0] == '+' && result> Integer.MAX_VALUE/10)
                    ||(i<chars.length-1&&chars[0] == '-' && result< Integer.MIN_VALUE/10)){
                return 0;
            }
        }
        if (chars[0] == '-') {
            return -1*result;
        }else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("123"));
    }
}
