package Chapter1;
import java.util.*;
public class q5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str1=new String("abe");
		String str2=new String("abce");
		int a[]=new int[256];
		int b[]=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			a[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++)
		{
			b[str2.charAt(i)]++;
		}
		int abSum=0;
		for(int i=0;i<256;i++)
		{
			abSum+=Math.abs(a[i]-b[i]);
		}
		if(abSum>2){System.out.println("No");}
		else{System.out.println("Yes");}
	}
}
