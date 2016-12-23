package Chapter2;
import java.util.*;
public class q2 {
	public static void main(String args[]) {
		linkedList llist=new linkedList(10,10);
		llist.printList();
		llist.removeKthLast(2);
		llist.printList();
	}
}
