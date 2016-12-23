package Chapter3;
import java.util.*;
public class q5 {
	public static void main(String args[]) {
		Random rand=new Random();
		stackSort<Integer> stack=new stackSort<Integer>();
		for(int i=0;i<10;i++)
		{
			stack.push(rand.nextInt(10));
		}
		stack.print();
		System.out.println("************");
		stack.sort();
		stack.print();
	}
}
