package classical;

/**
 * 堆排序
 * Created by jiashilin on 2017/5/31.
 */
public class HeapSort {
    public static int getLeft(int root){
        return root*2;
    }
    public static int getRight(int root){
        return root*2+1;
    }
    public static void BuiltHeap(int[] A, int length){
        for (int i = length/2; i >0 ; i--) {
            Adjust(A,i,length);
        }
    }
    public static void HeapSort(int[] A, int length){
        int temp;
        BuiltHeap(A, length);   //新建一个最大堆
        for(int i=length;i>1;i--){//将堆的末尾一个元素与堆的最大元素互换
            temp = A[0];
            A[0] = A[i-1];
            A[i-1] = temp;
            Adjust(A, 1, i-1);	//将堆末尾元素剔除，重新调整成length-1的最大堆
        }
    }
    //堆的调整算法 int[]A 数组，存储堆数据。int s 当前子堆的堆顶元素所在数组的下标。int length A的长度。
    //特别注意A的实际下标与输入的位置s、left、right差1
    public static void Adjust(int[] A, int s, int length){
        int max,temp;
        int left=getLeft(s);
        int right=getRight(s);
        //分不同情况进行考虑，left、right都在length之内的情况
        if (left <= length && right <= length) {
            if (A[left-1]>=A[right-1]){
                max = left;
            }else {
                max = right;
            }
            if (A[s-1] >= A[max-1]) {
                return;
            }else{
                temp = A[s-1];
                A[s-1] = A[max-1];
                A[max-1] = temp;
                Adjust(A,max,length);
            }

        }//left在length之内，但是right不在的情况
        else if(left == length){
            if (A[left-1] <= A[s-1]) {
                return;
            }else{
                temp = A[s-1];
                A[s-1]= A[left-1];
                A[left-1] = temp;
            }
        }else{//left、right都不在length之内的情况
            return;
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,123,234,345,12,34,56,78,89,45,9};
        HeapSort(A,A.length);
        for (int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }

    }

}
