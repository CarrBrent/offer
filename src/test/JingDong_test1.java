package test;
import java.util.Scanner;



public class JingDong_test1 {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		char[] aString=cin.next().toCharArray();
		char[] bString=cin.next().toCharArray();
		
		int[] result=Xor(aString,bString);
		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (result[i]==1) {
				answer = (int)(Math.pow(2,n-i-1)+answer);
			}
			 
		}
		System.out.println(answer);
	}

	private static int[] Xor(char[] a, char[] b) {
		int[] result=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i]==b[i]) {
				result[i]=0;
			}else{
				result[i]=1;
			}
		}
		return result; 
	}


}
