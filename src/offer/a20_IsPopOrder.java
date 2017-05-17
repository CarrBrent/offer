package offer;

import java.util.Stack;

/**
 * Created by jiashilin on 2017/5/17.
 */
public class a20_IsPopOrder {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 && popA.length==0) {
            return true;
        }
        int length = pushA.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0,j=0; j <length ;) {
            //如果stack里面没有数据,而且pushA的数据还没有全部压栈。
            if (i<length && stack.size() == 0) {
                if (pushA[i] != popA[j]) {
                    stack.push(pushA[i]);
                    i++;
                }else{
                    i++;
                    j++;
                }
                //如果stack里面有数据,而且pushA的数据还没有全部压栈。
            }else if (i<length && stack.size()!=0) {
                int top = stack.pop();
                stack.push(top);
                //需要跟将要压栈的数据以及栈顶的数据去比较
                if (pushA[i] != popA[j] && top!=popA[j]) {
                    stack.push(pushA[i]);
                    i++;
                }else if (pushA[i] == popA[j] ) {
                    i++;
                    j++;
                }else if (top == popA[j]) {
                    stack.pop();
                    j++;
                }
                //pushA里面的数据已经全部压栈
            }else if (i>=length){
                int top = stack.pop();
                stack.push(top);
                if (top == popA[j]) {
                    stack.pop();
                    j++;
                }else{
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1};
        System.out.println(IsPopOrder(a,b));
    }
}
