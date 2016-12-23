package Chapter2;
import java.util.*;
public class q1 {
	public static void main(String args[]) {
		linkedList llist=new linkedList(100,11);
		llist.printList();
		llist.removeDups();
		System.out.println("***************");
		llist.printList();
	}
	
	
}
