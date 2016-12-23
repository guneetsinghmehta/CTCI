package Chapter2;
import java.util.*;
public class q5 {
	public static void main(String args[]) {
		linkedList l1=new linkedList(2,10);
		linkedList l2=new linkedList(2,10);
		linkedList ans=new linkedList();
		l1.printList();
		l2.printList();
		ans.printList();
		Node A=l1.head,B=l2.head;
		int a,b,c=0,sum;
		while(A!=null||B!=null)
		{
			a=A==null?0:A.data;
			b=B==null?0:B.data;
			sum=a+b+c;
			c=(sum-sum%10)/10;
			sum=sum%10;
			
			if(A!=null){A=A.next;}
			if(B!=null){B=B.next;}
			ans.addNode(sum);
		}
		if(c!=0){ans.addNode(c);}
		ans.printList();
	}
}
