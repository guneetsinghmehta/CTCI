package Chapter3;
import java.util.*;
public class queueUsingStack <T>{
	private Stack<T> inQ=new Stack<T>();
	private Stack<T> outQ=new Stack<T>();
	public void enqueue(T x)
	{
		inQ.push(x);
	}
	
	public T dequeue()
	{
		if(outQ.isEmpty()&&!inQ.isEmpty())
		{
			while(!inQ.isEmpty())
			{
				outQ.push(inQ.pop());
			}
		}
		return outQ.pop();
	}
	
	public int size()
	{
		return inQ.size()+outQ.size();
	}
}
