package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jiashilin on 2017/6/2.
 */
public class a32_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        //转换成String类型的数据
        ArrayList<String> list = new ArrayList<String>();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c2.compareTo(c1);
            }
        });
        for (int i = 0; i <list.size() ; i++) {
            result.append(list.get(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {

                if (s1 >= s2) {
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i <list.size() ; i++) {
            result.append(list.get(i));
        }
        System.out.println(result.toString());
    }
}
