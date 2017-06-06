package offer;

/**
 * Created by jiashilin on 2017/6/6.
 */
public class a37_GetNumberOfK {
    public static int GetNumberOfK(int [] array , int k) {
        if (array == null) {
            return 0;
        }
        if (array.length == 1 && array[0]==k) {
            return 1;
        }
        int count =0;
        int n = getPosition(array,0,array.length-1,k);
        if (n == -1) {
            return 0;
        }
        int m =n-1;
        while(n<array.length&&array[n]==k){
            count++;
            n++;
        }
        while(m>=0&&array[m]==k){
            count++;
            m--;
        }
        return count;
    }
    private static int getPosition(int[] data,int begin,int end,int k){
        int ind = -1;
        if(begin >= end) return -1;
        int mid = (end + begin) / 2;
        if(k == data[mid]) return mid;
        if((ind = getPosition(data,begin,mid,k)) != -1) return ind;
        if((ind = getPosition(data,mid+1,end,k)) != -1) return ind;
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1};
        System.out.println(GetNumberOfK(array,1));
    }
}
