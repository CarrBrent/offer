package offer;

/**
 * Created by jiashilin on 2017/6/8.
 */
public class a43_LeftRotateString {
    public static String LeftRotateString(String str,int n) {
        if (n<=0||str == null|| str.trim().equals("")) {
            return str;
        }
        if (n >= str.length()) {
            n =n%str.length();
        }
        String strReverse = reverse(str.toCharArray());
        StringBuffer buffer = new StringBuffer();
        //注意，在使用substring（int begin，int end）的时候要注意，subString里面是不包含end位上的字符的。
        String left = strReverse.substring(0,str.length()-n);
        String right = strReverse.substring(strReverse.length()-n,strReverse.length());
        buffer.append(reverse(left.toCharArray()));
        buffer.append(reverse(right.toCharArray()));
        return buffer.toString();
    }
    public static String reverse(char[] chars){
        char tmp;
        for (int i = 0,j=chars.length-1; i<=j ; i++,j--) {
            tmp = chars[i];
            chars[i]=chars[j];
            chars[j]=tmp;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("12345678",3));
    }
}
