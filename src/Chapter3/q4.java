package Chapter3;
import java.util.*;
public class q4 {
	public static void main(String args[]) {
		queueUsingStack<Integer> q=new queueUsingStack<Integer>();
		for(int i=1;i<=10;i++)
		{
			q.enqueue(i);
		}
		while(q.size()!=0)
		{
			System.out.println(q.dequeue());
		}
	}
}
