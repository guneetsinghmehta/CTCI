package Chapter1;
import java.util.*;
public class q8 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int mat[][]={{1,2,3,0},{5,6,7,8},{9,0,11,12},{13,14,15,16}};
		print(mat);
		removeZeros(mat);
		print(mat);
	}
	
	public static void removeZeros(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0){a[i][a[0].length-1]=0;a[a.length-1][j]=0;}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][a[0].length-1]==0||a[a.length-1][j]==0)
				{
					a[i][j]=0;
				}
			}
		}
	}
	
	public static void print(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.format("%d\t",mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
