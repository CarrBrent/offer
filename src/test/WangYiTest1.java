package test;

import java.util.Scanner;


public class WangYiTest1 {
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		int[] a= new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=cin.nextInt();
		}
		getK(a,k);
	}

	private static void getK(int[] a, int k) {
		int begin = a[0];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j==a.length-1) {
					a[j]=a[j]+begin;
					begin = a[0];
				}else {
					a[j]=a[j]+a[j+1];
				}
				if (a[j]>=100) {
					a[j]=a[j]-100;
				}
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print(a[a.length-1]);

	}

}
