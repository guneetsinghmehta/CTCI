package Chapter1;

public class q2 {
	public static void main(String args[])
	{
		System.out.println(compare(new String("abc"),new String("cbad")));
	}
	public static boolean compare(String str1,String str2)
	{
		int a[]=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			a[str1.charAt(i)]++;
		}
		int b[]=new int[256];
		for(int i=0;i<str2.length();i++)
		{
			b[str2.charAt(i)]++;
		}
		boolean ans=true;
		for(int i=0;i<256;i++)
		{
			if(a[i]!=b[i]){ans=false;}
		}
		return ans;
	}
}
