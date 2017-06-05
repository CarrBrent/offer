package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/6/2.
 */
public class a33_UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index <=5) {
            return index;
        }

        //初始化丑数数组{1，2，3，4，5}
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }
        //X2X3X5分别存储*2、3、5之后大于最后一个丑数的位置
        int X2=1;
        int X3=1;
        int X5=1;
        int min =0;
        for (int i = 6; i <=index ; i++) {
            for (int j = X2; j <list.size() ; j++) {
                if(list.get(j-1)*2>list.get(list.size()-1)){
                    X2 = j;
                    break;
                }
            }
            for (int j = X3; j <list.size() ; j++) {
                if(list.get(j-1)*3>list.get(list.size()-1)){
                    X3 = j;
                    break;
                }
            }
            for (int j = X5; j <list.size() ; j++) {
                if(list.get(j-1)*5>list.get(list.size()-1)){
                    X5 = j;
                    break;
                }
            }
            min = (list.get(X2-1)*2 <=list.get(X3-1)*3 )?list.get(X2-1)*2:list.get(X3-1)*3;
            min = (min<=list.get(X5-1)*5 )?min:list.get(X5-1)*5;
            list.add(min);
        }
        return list.get(list.size()-1);
    }

}
