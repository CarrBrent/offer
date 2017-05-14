package test;

import java.util.Scanner;
import java.util.regex.*;

public class Alibaba_test1{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String line2 = in.nextLine();
		boolean result=Pattern.compile(line).matcher(line2).find();
		if (result) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}