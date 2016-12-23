package Chapter3;
import java.util.*;
public class stackSort<T extends Comparable<T>> implements Comparator<T> 
{
	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}
	private Stack<T> mainStack=new Stack<T>();
	private Stack<T> auxStack=new Stack<T>();
	
	public T pop(){return mainStack.pop();}
	
	public void push(T x){mainStack.push(x);}
	
	public int size(){return mainStack.size();}
	
	public boolean isEmpty()
	{
		boolean ans=false;
		if(mainStack.isEmpty()){ans=true;}
		return ans;
	}
	
	public void print()
	{
		while(!mainStack.isEmpty())
		{
			auxStack.push(mainStack.pop());
			System.out.println(auxStack.peek());
		}
		while(!auxStack.isEmpty())
		{
			mainStack.push(auxStack.pop());
		}
	}
	public void sort()
	{
		while(!mainStack.isEmpty())
		{
			T x=mainStack.pop();
			if(auxStack.isEmpty())
			{
				auxStack.push(x);
			}
			else
			{
				while(!auxStack.isEmpty()&&auxStack.peek().compareTo(x)==1)
				{
					mainStack.push(auxStack.pop());
				}
				auxStack.push(x);
			}
		}
		while(!auxStack.isEmpty())
		{
			mainStack.push(auxStack.pop());
		}
	}
}
