package Chapter1;

import java.io.*;
import java.util.HashMap;

public class commonTemplate {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("test1"));
		String str;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		while((str=br.readLine())!=null)
		{
			String words[]=str.split("\\W+");
			for(String word:words)
			{
				int length=word.length();
				if(map.containsKey(length))
				{
					map.put(length, map.get(length)+1);
				}
				else
				{
					map.put(length, 1);
				}
			}
		}
		int max=Integer.MIN_VALUE;
		int maxIndex=-1;
		for(int a:map.keySet())
		{
			if(max<map.get(a)){max=map.get(a);maxIndex=a;}
			System.out.format("%d %d\n",a,map.get(a));
		}
		System.out.println(maxIndex);
	}
}
