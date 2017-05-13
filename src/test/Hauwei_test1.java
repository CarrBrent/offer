package test;

import java.util.Scanner;


public class Hauwei_test1 {
	public static void getLower(String str) {
		str.replace("[^\u4e00-\u9fa5a-zA-Z0-9]", "");
		System.out.println(str.toLowerCase());

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();

		getLower(str);

	}

}
