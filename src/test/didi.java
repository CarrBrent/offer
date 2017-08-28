package test;

import java.util.*;

/**
 * Created by carrbrent on 2017/8/26.
 */
public class didi {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        System.out.println(map.get(0));

        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        int k = in.nextInt();
        String[] num= line1.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            list.add(Integer.parseInt(num[i]));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-k));
    }


}
