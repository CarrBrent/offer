package test;
import java.util.Arrays;
import java.util.Scanner;


public class Huawei_test2 {
	public static int fiveFu(String[] str) {
		//将输入转化成二维数组
		int[][] intfu = new int[str.length][5];
		for (int i = 0; i < str.length; i++) {
			char[] charArray = str[i].toCharArray();
			for (int j = 0; j < 5; j++) {
				intfu[i][j]=Integer.parseInt(String.valueOf(charArray[j]));
			}
		}
		
		//求出该组人的每个福字的总个数
		int[] counts = new int[5];
		Arrays.fill(counts, 0);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < str.length; j++) {
				counts[i]=intfu[j][i]+counts[i];
			}
		}
		
		//求出counts[]中的最小数字就是该题目中的答案
		int result=counts[0];
		for (int i = 0; i < counts.length; i++) {
			if (counts[i]<result) {
				result=counts[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] str = new String[9];
		Arrays.fill(str, "00000");
		for (int i = 0; i < 9; i++) {
			str[i] = cin.nextLine();
			if (str[i].equals("EOF")) {
				str[i]="00000";
				break;
			}
		}
		
		
		System.out.println(fiveFu(str));
	}

}
