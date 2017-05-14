package classical;

public class AllPermutation {
	public static boolean call(char[] b) {
		//找到最右边升序的前一个位置i，x = b[i]
		int i =0;
		for (i = b.length-2; i>=0 && b[i]>=b[i+1];i-- ) {
		}
		//如果找到所有排列，退出
		if (i<0) {
			return false;
		}
		//找到最右边升序的最右边的比b[i]大的元素
		int j =0;
		for (j = b.length-1; b[i]>b[j]; j--) {
		}
		//交换b[i] 和b[j]
		char temp = b[i];
		b[i]=b[j];
		b[j]=temp;
		
		//将b[i]之后部分进行反转。
		reverse(b,i+1,j);
		return true;
		
	}
	private static void reverse(char[] b, int i, int j) {
		
		StringBuffer stringBuffer = new StringBuffer();
		for (int k = i; k <= j; k++) {
			stringBuffer.append(b[k]);
		}
		char[] c = stringBuffer.reverse().toString().toCharArray();
		for (int l = i-i; l <= j-i; l++) {
			b[i+l]=c[l];
		}
		
		
	}
	public static void main(String[] args) {
		String a = "2138547";
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		while (true) {

			boolean flag= call(b);
			while (flag==true) {
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i]);
				}
				System.out.println();

				flag= call(b);
			}
			return;
		}
		
		
	}

}
