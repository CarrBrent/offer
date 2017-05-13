package test;

import java.util.Scanner;


public class WangyiTest2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		System.out.println(Math.min(getG(line), getB(line)));
	}

	private static int getB(String line) {
		char[] l= line.toCharArray();
		int[] num = new int[l.length];
		for (int i = 0; i < l.length; i++) {
			if (l[i]=='B') {
				num[i]=i+1;
			}
		}
		int m = 1;
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]!=0) {
				result = result+num[i]-m;
				m++;
			}
		}
		return result;

	}

	private static int getG(String line) {
		char[] l= line.toCharArray();
		int[] num = new int[l.length];
		for (int i = 0; i < l.length; i++) {
			if (l[i]=='G') {
				num[i]=i+1;
			}
		}
		int m = 1;
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]!=0) {
				result = result+num[i]-m;
				m++;
			}
		}
		return result;

	}

}
