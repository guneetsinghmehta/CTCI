package Chapter3;
import java.util.*;
public class q2 {
	public static void main(String args[]) {
		minStack<Integer> stack=new minStack<Integer>();
		stack.push(1);
		stack.push(50);
		stack.push(500);
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		
	}
}
