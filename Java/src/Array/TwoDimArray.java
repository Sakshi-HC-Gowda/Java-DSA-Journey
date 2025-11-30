package Array;
import java.util.*;
public class TwoDimArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};//static input
		int arr[][]=new int[3][3];//dynamic input
		Scanner in =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)//row 
			{
			for(int j=0;j<arr[i].length;j++)//col 
				{
				System.out.println("enter"+i+" "+j+":");
		arr[i][j]=in.nextInt();
		
	}
	}
for(int i=0;i<arr.length;i++)//row 
	{
	for(int j=0;j<arr[i].length;j++)//col
		{
		System.out.print(arr[i][j]+" ");
		}
System.out.println();
	}
	}
}

