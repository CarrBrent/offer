package offer;

/**
 * Created by jiashilin on 2017/6/10.
 */
public class a50_Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int[] numbers,int length,int[] duplication) {
        if (numbers == null||numbers.length==0) {
            return false;
        }
        // 判断数组是否合法（每个数都在0~n-1之间）
        for ( int i=0; i<length; i++ ) {
            if ( numbers[i]<0 || numbers[i]>length-1 ) {
                return false;
            }
        }
        for (int i = 0; i <numbers.length ; i++) {
            while(numbers[i] != i) {
                if (numbers[numbers[i]] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int tmp = numbers[numbers[i]];
                numbers[numbers[i]] = i;
                numbers[i]=tmp;
            }
        }
        return false;

    }
}
