package Chapter3;
import java.util.*;
public class minStack<T extends Comparable<T>> implements Comparator<T> {
	//make two stacks private - number and minimum
	//operation of push, pop and peek and size
	private Stack<T> mainStack=new Stack<T>();
	private Stack<T> auxStack=new Stack<T>();
	
	public T min()
	{
		T ans=null;
		if(!auxStack.isEmpty()){ans=auxStack.peek();}
		return ans;
	}
	
	public void push(T x)
	{
		if(mainStack.isEmpty())
		{
			auxStack.push(x);
		}
		else
		{
			T minCurrent=auxStack.peek();
			if(minCurrent.compareTo(x)==1)
			{
				auxStack.push(x);
			}
		}
		mainStack.push(x);
	}
	
	public T pop()
	{
		T ans=null;
		if(!mainStack.isEmpty())
		{
			ans=mainStack.pop();
			if(ans.compareTo(auxStack.peek())==0)
			{
				auxStack.pop();
			}
		}
		return ans;
	}
	
	public int length()
	{
		return mainStack.size();
	}
	
	public T peek()
	{
		T ans=null;
		if(!mainStack.isEmpty()){ans=mainStack.peek();}
		return ans;
	}

	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}

	
}
