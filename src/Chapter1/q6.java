package Chapter1;
import java.util.*;
public class q6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str=new String("aaabbcc");
		StringBuilder sb=new StringBuilder();
		int i=0,j,count;
		while(i<str.length())
		{
			count=1;
			j=i+1;
			while(j<str.length()&&str.charAt(i)==str.charAt(j))
			{
				count++;
				j++;
			}
			sb.append(str.charAt(i));
			sb.append(Integer.toString(count));
			i=j;
		}
		String ans=sb.length()<str.length()?sb.toString():str;
		System.out.println(ans);
	}
}
