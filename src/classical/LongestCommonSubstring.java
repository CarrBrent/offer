package classical;
//最长公共子序列
public class LongestCommonSubstring {
	
	public static void main(String[] args) {
		char[] a =" adsfwqet".toCharArray();
		char[] b = " adsfjeg".toCharArray();
		int[][] n = getLCS(a,b);
		Display(n,a,a.length-1,b.length-1);

	}

	private static void Display(int[][] n, char[] a, int i, int j) {
		if (i==0||j==0) {
			return;
		}
		if (n[i][j]==1) {
			Display(n, a, i-1, j-1);
			System.out.print(a[i]+"");
		}else if (n[i][j]==0) {
			Display(n, a, i-1, j);
		}else if (n[i][j]==-1) {
			Display(n, a, i, j-1);
		}
	}

	private static int[][] getLCS(char[] a, char[] b) {
		//存储当前LCS长度
		int[][] m = new int[a.length][b.length];
		//存储回溯记录
		int[][] n = new int[a.length][b.length];
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < b.length; j++) {
				//对应两个字符相等的情况
				if (a[i]==b[j]) {
					m[i][j] = m[i-1][j-1]+1;
					n[i][j] = 1;
				}
				//对应两个字符不想等的情况
				else if (m[i-1][j]>= m[i][j-1]) {
					m[i][j] = m[i-1][j];
					n[i][j] = 0;
				}else {
					m[i][j] = m[i][j-1];
					n[i][j] = -1;
				}
			}
			
		}
		return n;
		
		
	}
}
