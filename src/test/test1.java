package test;

import java.util.*;
public class test1
{
	public static void getLight(int n) {
		int[] light = new int[n];
		for (int i = 0; i < light.length; i++) {
			light[i]=0;
		}
		for (int i = 2; i <= light.length; i++) {
			for (int j = i; j <= light.length; j=j+i) {

				light[j-1]=(light[j-1]+1)%2;

			}
		}
		for (int i = 0; i < light.length; i++) {
			System.out.print(light[i]);
		}

	}
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int n;
		while(cin.hasNextInt())
		{
			n = cin.nextInt();
			getLight(n);

		}
	}
}