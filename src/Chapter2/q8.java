package Chapter2;
import java.util.*;
public class q8 {
	public static void main(String args[]) {
		linkedList l1=new linkedList(10,10);
		Node beginning=l1.getNode(4);
		l1.printList();
		Node last=l1.getNode(l1.getLength()-1);
		last.next=beginning;
		//l1.printList();
		Node A,B;
		A=l1.head;B=A;
		A=A.next;
		B=B.next.next;
		while(A!=B)
		{
			A=A.next;
			B=B.next.next;
		}
		A=l1.head;
		while(A!=B)
		{
			A=A.next;
			B=B.next;
		}
		System.out.println(A.data);
	}
}
