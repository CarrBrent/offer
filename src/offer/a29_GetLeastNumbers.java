package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/5/23.
 */


/*
测试用例:
[4,5,1,6,2,7,3,8],4

对应输出应该为:

[1,2,3,4]

你的输出为:

java.lang.ArrayIndexOutOfBoundsException: -1
 */
public class a29_GetLeastNumbers {
    //root:list[root-1]
    //left:list[root*2-1]
    //right:list[root*2+1-1]
    //获得左子节点的坐标值list[root*2-1]
    public int getLeft(int root){
        return root*2;
    }
    //获得右子节点的坐标值list[root*2+1-1]
    public int getRight(int root){
        return root*2+1;
    }
    //从最后一个非叶子节点开始，一次执行调整算法，list[i]，逐次i--，i=length/2
    public void bulidHeap(int [] list, int length){
        for (int i = length/2; i >=0 ; i--) {
            adjust(list,i,length);
        }
    }
    private void adjust(int[] list, int s, int length) {
        int temp,max;
        int left=getLeft(s);
        int right=getRight(s);
        if (left<=length&&list[left-1]>list[s-1]){
            max = left;
        }
        else {
            max=s;
        }
        if (right<=length&&list[right-1]>list[max-1]) {
            max=right;
        }
        else {
            ;
        }
        if (max!=s) {
            temp = list[s-1];
            list[s-1]=list[max-1];
            list[max-1]=temp;
            adjust(list, max, length);
        }

    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input == null || input.length<=1 || k>=input.length) {
            return result;
        }
        bulidHeap(input,k);
        for (int i = k; i <= input.length ; i++) {
            if (input[i] < input[0]) {
                input[0] = input[i];
                adjust(input,1,k);
            }
        }
        for (int i = 0; i < k ; i++) {
            result.add(input[i]);
        }
        return result;
    }
}
