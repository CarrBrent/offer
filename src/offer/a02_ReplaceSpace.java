package offer;

/**
 * Created by jiashilin on 2017/5/13.
 */
public class a02_ReplaceSpace {
    /*
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
      如果是可以使用新的字符串做计算的话，需要额外的存储空间，不是该题目原意。
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
      从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
*/

    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spacenum++;
            }
        }

        int lastposition = str.length()-1;//原始字符串最后一位的位置
        int newlength = str.length()+(3-1)*spacenum;//新字符串的长度
        str.setLength(newlength);
        for(;lastposition>=0;lastposition--){
            if (str.charAt(lastposition)==' '){
                str.setCharAt(newlength-1,'0');
                str.setCharAt(newlength-2,'2');
                str.setCharAt(newlength-3,'%');
                newlength = newlength-3;
            }else{
                str.setCharAt(newlength-1,str.charAt(lastposition));
                newlength = newlength-1;
            }
        }
        return str.toString();

    }

}
