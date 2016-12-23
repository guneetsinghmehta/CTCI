package Chapter1;
import java.util.*;
public class trial1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String temp=new String("AA- BB,");
		for(String s:temp.split("\\W+"))
		{
			System.out.println(s);
			
		}
		
	}
}
