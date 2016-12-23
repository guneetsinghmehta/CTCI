package Chapter3;
import java.util.*;
public class stackOfStacks<T> {
	Stack<Stack<T>> stackCollection=new Stack<Stack<T>>();
	Stack<T> currentStack=new Stack<T>();
	int limit;
	public stackOfStacks(int limit)
	{
		this.limit=limit;
	}
	
	public void push(T x)
	{
		if(currentStack.size()==limit)
		{
			stackCollection.push(currentStack);
			currentStack=new Stack<T>();
		}
		currentStack.push(x);
	}
	
	public T pop()
	{
		if(currentStack.size()==0&&!stackCollection.isEmpty())
		{
			currentStack=stackCollection.pop();
		}
		T ans=currentStack.pop();
		return ans;
	}
	
	public boolean isEmpty()
	{
		boolean ans=false;
		if(currentStack.isEmpty()&&stackCollection.isEmpty())
		{
			ans=true;
		}
		return ans;
	}
}
