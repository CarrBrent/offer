package test;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class test2 {
	
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int m = cin.nextInt();
			a.put(m, m);
		}
		getWinner(n,a);
	}

	private static void getWinner(int n, HashMap<Integer, Integer> a) {
		System.out.println(n-3);
		
	}

}
