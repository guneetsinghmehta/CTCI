package Chapter2;
import java.util.*;
public class q6 {
	public static void main(String args[]) {
		linkedList llist=new linkedList(3,2);
		llist.printList();
		System.out.println("pallindrome="+llist.isPallindrome());
	}
}
