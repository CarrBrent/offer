package leetcode;
import java.util.*;
public class ReversePolishNotation
{
	public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].equals("+")&!tokens[i].equals("-")&!tokens[i].equals("*")&!tokens[i].equals("/")) {
				stack.push(Integer.parseInt(tokens[i]));
			}else if (tokens[i].equals("+")) {
				stack.push(stack.pop()+stack.pop());
			}else if (tokens[i].equals("-")) {
				int a =stack.pop();
				int b =stack.pop();
				stack.push(b-a);
			}else if (tokens[i].equals("*")) {
				stack.push(stack.pop()*stack.pop());
			}else if (tokens[i].equals("/")) {
				int a =stack.pop();
				int b =stack.pop();
				stack.push(b/a);
			}
		}
        return stack.pop();
        
    }
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		char[] charArray = str.toCharArray();
		String[] strings = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case 'A':
				strings[i]="10";
				break;
			case 'B':
				strings[i]="11";
				break;
			case 'C':
				strings[i]="12";
				break;
			case 'D':
				strings[i]="13";
				break;
			case 'E':
				strings[i]="14";
				break;
			case 'F':
				strings[i]="15";
				break;
			case 'G':
				strings[i]="16";
				break;
			case 'H':
				strings[i]="17";
				break;
			case 'I':
				strings[i]="18";
				break;
			case 'J':
				strings[i]="19";
				break;
			case 'K':
				strings[i]="20";
				break;
			case 'L':
				strings[i]="21";
				break;
			case 'M':
				strings[i]="22";
				break;
			case 'N':
				strings[i]="23";
				break;
			case 'O':
				strings[i]="24";
				break;
			case 'P':
				strings[i]="25";
				break;
			case 'Q':
				strings[i]="26";
				break;
			case 'R':
				strings[i]="27";
				break;
			case 'S':
				strings[i]="28";
				break;
			case 'T':
				strings[i]="29";
				break;
			case 'U':
				strings[i]="30";
				break;
			case 'V':
				strings[i]="31";
				break;
			case 'W':
				strings[i]="32";
				break;
			case 'X':
				strings[i]="33";
				break;
			case 'Y':
				strings[i]="34";
				break;
			case 'Z':
				strings[i]="35";
				break;
			default:
				strings[i]= String.valueOf(charArray[i]);
				break;
			}
			
		}

		System.out.println(evalRPN(strings));
	}
}