package offer;

/**
 * Created by jiashilin on 2017/6/7.
 */
public class a40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null||array.length<2) {
            return;
        }
        int resultExclusiveOr = 0;
        for (int i = 0; i <array.length ; i++) {
            resultExclusiveOr ^=array[i];
        }
        int indexOf1 = FindFirstBitIs1(resultExclusiveOr);
        num1[0]=num2[0]=0;
        for (int i = 0; i <array.length ; i++) {
            if (IsBit1(array[i],indexOf1)) {
                num1[0]^= array[i];
            }else {
                num2[0]^=array[i];
            }
        }

    }
    private int FindFirstBitIs1(int num){
        int indexBit = 0;
        while (((num&1)==0)&&(indexBit<32)){
            num = num >>1;
            indexBit ++;
        }
        return indexBit;
    }
    private boolean IsBit1(int num,int indexBit){
        num = num >>indexBit;
        return (num&1)==1;
    }
}











