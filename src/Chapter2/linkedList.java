package Chapter2;
import java.util.*;
public class linkedList {
	Node head;
	int length;
	Node current;
	public linkedList()
	{
		head=null;
		length=0;
		current=null;
	}
	
	public Node getNode(int index)
	{
		int len=getLength();
		if(index>=len){return null;}
		Node temp=head;
		while(index-->0)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public int getLength()
	{
		int ans=0;
		Node temp=head;
		while(temp!=null){ans++;temp=temp.next;}
		return ans;
	}
	
	public Node addNode(int x)
	{
		if(head==null)
		{
			head=new Node(x);
			current=head;
			length=1;
		}
		else
		{
			current.next=new Node(x);
			current=current.next;
			length++;
		}
		return current;
	}
	
	public linkedList(int numNodes,int range)
	{
		Random random =new Random();
		this.length=numNodes;
		this.head=new Node(random.nextInt(range));
		Node temp=this.head;
		numNodes--;
		while(numNodes-->0)
		{
			temp.next=new Node(random.nextInt(range));
			temp=temp.next;
		}
	}
	
	public void printList()
	{
		Node temp=this.head;
		while(temp!=null){System.out.println(temp.data);temp=temp.next;}
		System.out.println("*************");
	}
	
	public void removeDups()
	{
		Node A=this.head;
		HashSet<Integer> map=new HashSet<Integer>();
		map.add(A.data);
		Node B=A.next;
		while(B!=null)
		{
			while(B!=null&&map.contains(B.data))
			{
				B=B.next;
			}
			if(B!=null)
			{
				map.add(B.data);
			}
			A.next=B;
			A=B;
			if(B!=null){B=B.next;}
		}
	}

	public void removeKthLast(int k)
	{
		if(k<1){System.out.println("k should be atleast 1");return;}
		Node A=this.head;
		Node B=this.head;
		while(k-->0)
		{
			B=B.next;
		}
		while(B.next!=null)
		{
			A=A.next;
			B=B.next;
		}
		A.next=A.next.next;
	}
	
	public void lessThanSort(int x)
	{
		Node A=this.head;
		Node B=A;
		while(B!=null)
		{
			while(A.data<x)
			{
				A=A.next;
			}
			B=A.next;
			while(B!=null&&B.data>=x)
			{
				B=B.next;
			}
			if(B!=null)
			{
				int temp=A.data;
				A.data=B.data;
				B.data=temp;
			}
		}
	}
	
	public boolean isPallindrome()
	{
		boolean ans=true;
		Stack<Integer> stack=new Stack<Integer>();
		Node temp=this.head;
		while(temp!=null)
		{
			stack.add(temp.data);
			temp=temp.next;
		}
		temp=this.head;
		while(temp!=null)
		{
			if(temp.data!=stack.pop()){ans=false;break;}
			temp=temp.next;
		}
		return ans;
	}
}
