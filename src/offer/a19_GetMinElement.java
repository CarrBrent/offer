package offer;

import java.util.Stack;

/**
 * Created by jiashilin on 2017/5/17.
 */
public class a19_GetMinElement {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int node) {
        if(stack.size()==0){
            stack.push(node);
            min.push(node);
        }else {
            stack.push(node);
            int m =min.peek();//peek()和pop()都会返回stack顶部的元素，但是peek不会将其在stack中删除
            //int m = min.pop();
            //min.push(m);
            if (m>=node) {
                min.push(node);
            }else{
                min.push(m);
            }
        }
    }

    public void pop() {
        if (stack.size()==0) {
            return;
        }
        stack.pop();
        min.pop();
    }

    public int top() {
        if (stack.size() == 0) {
            return 0;
        }
        int top = stack.pop();
        stack.push(top);
        return top;

    }

    public int min() {
        if (stack.size() == 0) {
            return 0;
        }
        int m = min.pop();
        min.push(m);
        return m;

    }
}
