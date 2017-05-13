package test;
import java.util.Scanner;


public class Huawei_test3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str ;
		int[] counts = new int[5];
		while (cin.hasNext() && !(str=cin.nextLine()).equals("EOF") ) {
			char[] charArray = str.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[j]=='1') {
					counts[j]++;
				}
			}
		}
		//求出counts[]中的最小数字就是该题目中的答案
		int result=counts[0];
		for (int i = 0; i < counts.length; i++) {
			if (counts[i]<result) {
				result=counts[i];
			}
		}
		System.out.println(result);
	}

}
