package offer;

import java.util.Stack;

/**
 * Created by jiashilin on 2017/5/14.
 */
public class a05_2StacksToQueue {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);

    }

    public static int pop() {
        if (stack1 == null) {
            return -1;
        }else{
            int size1 = stack1.size();
            for (int i = 0; i < size1; i++) {
                stack2.push(stack1.pop());
            }
            int result = stack2.pop();
            int size2 =  stack2.size();
            for (int i = 0; i < size2; i++) {
                stack1.push(stack2.pop());
            }
            return result;
        }

    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());
    }
}
