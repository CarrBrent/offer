package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/5/18.
 */
//顺时针打印矩阵
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵：
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
// 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class a21_printMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null) {
            return null;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (result == null) {

        }
        print(matrix,0,row-1,0,column-1,result);
        return result;
    }

    private static void print(int[][] matrix, int top, int bottom, int left, int right, ArrayList<Integer> result) {
        if (top>bottom || left> right) {
            return;
        }
        // 打印上边一行
        for (int i = left; i <=right ; i++) {
            result.add(matrix[top][i]);
        }
        // 打印右边一列
        for (int i = top+1; i <=bottom ; i++) {
            result.add(matrix[i][right]);
        }
        // 打印下边一行
        if (top < bottom) {//判断只有一行的情况，不会打印两次
            for (int i = right-1; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
        }

        // 打印左边一列
        if (left < right) {//判断只有一列的情况，不会打印两次
            for (int i = bottom-1; i >top ; i--) {
                result.add(matrix[i][left]);
            }
        }

        top++;
        bottom--;
        left++;
        right--;
        print(matrix,top,bottom,left,right,result);

    }

    public static void main(String[] args) {
        int [][] a ={{1,2,3,4,5}};
        printMatrix(a);
    }
}
