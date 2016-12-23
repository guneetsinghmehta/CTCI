package Chapter2;
import java.util.*;
public class q3 {
	public static void main(String args[]) {
		linkedList llist=new linkedList(10,10);
		llist.printList();
		Node temp=llist.head.next.next;
		temp.data=temp.next.data;
		temp.next=temp.next.next;
		llist.printList();
	}
}
