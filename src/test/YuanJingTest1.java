
package test;
import java.util.HashMap;

public class YuanJingTest1 {
	public static void main(String[] args) {
		int[] arrayA = new int[] {1,2,3,4};
		int[] arrayB = new int[] {2,3,4};
		GetSum(arrayA,arrayB);
	}

	private static void GetSum(int[] arrayA, int[] arrayB) {
		
		HashMap<Integer, Integer> A = new HashMap<Integer, Integer>();
		int result=0;
		//������һ������ת����Hashmap
		for (int i = 0; i < arrayA.length; i++) {
			A.put(arrayA[i], arrayA[i]);
		}
		//������һ�����飬�鿴�Ƿ����һ���������ظ�
		for (int i = 0; i < arrayB.length; i++) {
			if (A.containsKey(arrayB[i])) {
				result = result+arrayB[i];
			}
		}
		//result�д洢��ֻ����������1/2�������Ҫ*2
		System.out.println(result*2);
		
	}
	

}
