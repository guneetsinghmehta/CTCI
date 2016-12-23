package Chapter1;

public class q3 {
	private static int a=1;
	public static void main(String args[])
	{
		String temp=new String(" Mr John Smith");
		System.out.println(urlify(temp));
	}
	
	public static String urlify(String str)
	{
		int i,spaces=0,j;
		for(i=0;i<str.length();i++){if(str.charAt(i)==' '){spaces++;}}
		char c[]=new char[str.length()+2*spaces];
		for(i=0;i<str.length();i++){c[i]=str.charAt(i);}
		i=str.length()-1;
		j=c.length-1;
		while(i>=0)
		{
			while(i>=0&&c[i]!=' ')
			{
				c[j]=c[i];
				i--;
				j--;
			}
			if(i>=0)
			{
				c[j]='0';
				c[j-1]='2';
				c[j-2]='%';		
			}
			i--;
			j=j-3;
		}
		return new String(c);
	}
}
