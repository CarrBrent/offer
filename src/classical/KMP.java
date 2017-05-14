package classical;

public class KMP {
	//����ƥ��ʧ�ܵ�ʱ����ݾ�������next[]
	public static void getNext(String str, int[] next) {
		int length = str.length();
		char[] P = str.toCharArray();
		next[0] = -1;
		int k = -1;
		int j = 0;
		while (j<length-1) {
			//P[k]����ǰ׺��P[j]�����׺
			if (k==-1||P[j]==P[k]) {
				++k;
				++j;
				next[j]=k;
			}else {
				k=next[k];
			}
		}
	}
	public static void search(String original, String find, int next[]) {  
	    int j = 0;  
	    for (int i = 0; i < original.length(); i++) {  
	        while (j > 0 && original.charAt(i) != find.charAt(j))  
	            j = next[j];  
	        if (original.charAt(i) == find.charAt(j))  
	            j++;  
	        if (j == find.length()) {  
	            System.out.println("find at position " + (i - j + 2));  
	            System.out.println(original.subSequence(i - j + 1, i + 1));  
	            j = next[j];  
	        }  
	    }  
	}  

	public static void main(String[] args) {
		String original = "ABCDABCEOOFABCGR";
		String find = "ABC";
		//�洢ƥ��ʧ��ʱ�Ļ��ݾ���
		int[] next = new int[original.length()];
		getNext(original, next);
		System.out.println("next[] is:");
		for (int i = 0; i < next.length; i++) {
			System.out.print(next[i]);
		}
		System.out.println();
		search(original,find,next);
		
	}

}
