package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Alibaba_test2 {

	public static void main(String[] args) {

		ArrayList<Integer> inputs = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		if(line != null && !line.isEmpty()) {
			int res = resolve(line.trim());
			System.out.println(String.valueOf(res));
		}
	}

	// write your code here
	public static int resolve(String expr) {
		String[] tokens = expr.split(" ");
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].equals("+")&&!tokens[i].equals("*")&&!tokens[i].equals("^")) {
				if (tokens[i].trim().length()!=0) {
					stack.push(Integer.parseInt(tokens[i].trim()));
				}
				//内存溢出
				if (stack.size()>16) {
					return -2;
				}
			}else if (tokens[i].equals("+")) {
				//下溢出
				if (stack.size()<2) {
					return -1;
				}
				stack.push(stack.pop()+stack.pop());
			}else if (tokens[i].equals("*")) {
				//下溢出
				if (stack.size()<2) {
					return -1;
				}
				stack.push(stack.pop()*stack.pop());
			}else if (tokens[i].equals("^")) {
				//下溢出
				if (stack.size()<1) {
					return -1;
				}
				stack.push(stack.pop()+1);
			}
		}
		return stack.pop();

	}
}