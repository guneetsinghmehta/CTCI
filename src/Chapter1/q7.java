package Chapter1;
import java.util.*;
public class q7 {
	public static void main(String args[]) {
		int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(mat);
		rotate(mat,0,0,mat.length-1);
		print(mat);
	}
	
	public static void rotate(int A[][],int x,int y,int length)
	{
		int temp;
		for(int k=0;k<=length-1;k++)
		{
			temp=A[x][y+k];
			A[x][y+k]=A[x+k][y+length];
			A[x+k][y+length]=A[x+length][y+length-k];
			A[x+length][y+length-k]=A[x+length-k][y];
			A[x+length-k][y]=temp;
		}
		if(length>=2)
		{
			rotate(A,x+1,y+1,length-2);
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
