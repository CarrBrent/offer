
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
		//将其中一个数组转化成Hashmap
		for (int i = 0; i < arrayA.length; i++) {
			A.put(arrayA[i], arrayA[i]);
		}
		//遍历另一个数组，查看是否与第一个数组有重复
		for (int i = 0; i < arrayB.length; i++) {
			if (A.containsKey(arrayB[i])) {
				result = result+arrayB[i];
			}
		}
		//result中存储的只是输出结果的1/2，因此需要*2
		System.out.println(result*2);
		
	}
	

}
