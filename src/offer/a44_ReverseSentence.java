package offer;

/**
 * Created by jiashilin on 2017/6/8.
 */
public class a44_ReverseSentence {
    public static String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        if (str == null) {
            return "";
        }
        //先将整个字符串完全反转
        String strReverse = reverse(str.toCharArray());
        String[] strings = strReverse.split(" ");
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i <strings.length ; i++) {
            //再把每一部分的小段单独进行反转
            buffer.append(reverse(strings[i].toCharArray()));
            if (i != strings.length-1) {
                buffer.append(" ");
            }
        }
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
        System.out.println(ReverseSentence("Im a Student."));
    }
}
