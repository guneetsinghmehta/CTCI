//https://www.hackerrank.com/challenges/gridland-metro
package Chapter3;
import java.math.BigInteger;
import java.util.*;

public class trial2 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int testcases=Integer.parseInt(scanner.nextLine());
		while(testcases-->0)
		{
			String A=scanner.nextLine();
			String B=scanner.nextLine();
			String C=scanner.nextLine();
			int K=Integer.parseInt(scanner.nextLine());
			int len=Math.max(A.length(), Math.max(B.length(),C.length()));
			int a[]=(getBinary(A,len));
			int b[]=(getBinary(B,len));
			int c[]=(getBinary(C,len));
			System.out.println(getHex(a));
			System.out.println(getHex(b));
			System.out.println(getHex(c));
			int diffs=0;
			for(int i=0;i<a.length;i++)
			{
				if((a[i]|b[i])!=c[i])
				{
					if(c[i]==0)
					{
						if(a[i]==0&&b[i]==1){diffs=diffs+1;}
						else if(a[i]==1&&b[i]==0){diffs=diffs+1;}
						else if(a[i]==1&&b[i]==1){diffs=diffs+2;}
					}
					if(c[i]==1)
					{
						diffs++;
					}
				}
			}
			if(diffs>K){System.out.println(-1);}
			else
			{
				for(int i=0;i<a.length;i++)
				{
					if(c[i]==0)
					{
						a[i]=0;b[i]=0;
					}
					else if(c[i]==1)
					{
						if(a[i]==0&&b[i]==0){a[i]=0;b[i]=1;}
					}
				}
			}
			System.out.println(getHex(a));
			System.out.println(getHex(b));
		}
		scanner.close();
	}
	
	public static String getHex(int a[])
	{
		StringBuilder sb=new StringBuilder();
		StringBuilder temp=new StringBuilder();
		String str;
		for(int i=0;i<a.length/4;i++)
		{
			temp.setLength(0);
			temp.append(a[4*i]);
			temp.append(a[4*i+1]);
			temp.append(a[4*i+2]);
			temp.append(a[4*i+3]);
			str=temp.toString();
			sb.append(Integer.toString(Integer.parseInt(str),16));
		}
		return sb.toString();
	}
	
	public static int[] getBinary(String A,int len)
	{
		int origLength=A.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<A.length();i++)
		{
			String temp=A.substring(i, i+1);
			int num=Integer.parseInt(temp,16);
			temp=Integer.toBinaryString(num);
			for(int j=0;j<4-temp.length();j++)
			{
				sb.append('0');
			}
			sb.append(temp);
		}
		sb=sb.reverse();
		for(int i=0;i<len-origLength;i++)
		{
			sb.append("0000");
		}
		char c[]= sb.reverse().toString().toCharArray();
		int b[]=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			b[i]=(int)c[i]-48;
		}
		return b;
	}
}