package Chapter3;
import java.util.*;
public class q3 {
	public static void main(String args[]) {
		stackOfStacks<Integer> stack=new stackOfStacks<Integer>(2);
		for(int i=1;i<10;i++)
		{
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop()+" "+stack.stackCollection.size());
		}
	}
}
