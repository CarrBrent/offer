package test;
import java.util.Arrays;
import java.util.Scanner;


public class Huawei_test2 {
	public static int fiveFu(String[] str) {
		//������ת���ɶ�ά����
		int[][] intfu = new int[str.length][5];
		for (int i = 0; i < str.length; i++) {
			char[] charArray = str[i].toCharArray();
			for (int j = 0; j < 5; j++) {
				intfu[i][j]=Integer.parseInt(String.valueOf(charArray[j]));
			}
		}
		
		//��������˵�ÿ�����ֵ��ܸ���
		int[] counts = new int[5];
		Arrays.fill(counts, 0);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < str.length; j++) {
				counts[i]=intfu[j][i]+counts[i];
			}
		}
		
		//���counts[]�е���С���־��Ǹ���Ŀ�еĴ�
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
