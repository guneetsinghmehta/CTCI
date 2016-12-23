package Chapter2;
import java.util.*;
public class q7 {
	public static void main(String args[]) {
		linkedList l1=new linkedList();
		Node A=l1.addNode(0);
		linkedList l2=new linkedList();
		Node B=l2.addNode(1);
		A.next=B;
		
		int len1=l1.getLength();
		int len2=l2.getLength();
		A=l1.head;
		B=l2.head;
		int diff=(int)Math.abs(len1-len2);
		if(diff>0)
		{
			if(len1>len2)
			{
				while(diff-->0){A=A.next;}
			}
			else
			{
				while(diff-->0){B=B.next;}
			}
		}
		while(A!=null&&B!=null)
		{
			if(A==B)
			{
				System.out.println(A);
				break;
			}
			else
			{
				A=A.next;
				B=B.next;
			}
		}
	}
}
