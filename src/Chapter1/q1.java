package Chapter1;

import java.util.Arrays;

public class q1 {
	public static void main(String args[])
	{
		String str1="abcdefgh";//unique chars
		String str2="abcdefgha";//non unique chars
		System.out.println(unique(str1));
		System.out.println(unique(str2));
		
		System.out.println(unique2(str1.toCharArray()));
		System.out.println(unique2(str2.toCharArray()));
	}
	
	public static boolean unique2(char c[])
	{
		//no additional DS used
		boolean ans=true;
		Arrays.sort(c);
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]==c[i+1]){ans=false;break;}
		}
		return ans;
	}
	
	public static boolean unique(String str)
	{
		boolean ans=true;
		int array[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			if(array[str.charAt(i)]>0){return false;}
			else{array[str.charAt(i)]++;}
		}
		return true;
	}
}
