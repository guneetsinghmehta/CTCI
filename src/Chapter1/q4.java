package Chapter1;
import java.util.*;
public class q4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str1=new String("aacb");
		int c[]=new int[256];
		for(int i=0;i<str1.length();i++){c[str1.charAt(i)]++;}
		int odds=0;
		for(int i=0;i<256;i++)
		{
			if(c[i]%2==1){odds++;}
		}
		if(odds<=1){System.out.println("Yes");}
		else{System.out.println("No");}
	}
}
