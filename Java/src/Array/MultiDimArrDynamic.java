package Array;
import java.util.*;

public class MultiDimArrDynamic {

	public static void main(String[] args) {
		
		int arr[][][]=new int[3][3][3];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)//row 
		{
		for(int j=0;j<arr[i].length;j++)//col 
			{
			for(int k=0;k<arr[i][j].length;k++) {
			System.out.println("enter"+i+" "+j+" "+k+":");
	arr[i][j][k]=in.nextInt();
	
}
			System.out.println();
			}
			System.out.println();
			}
}}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				for(int k=0;k<arr[i][j].length;k++) {
//					System.out.print(arr[i][j][k]+" ");
//				}
			
	
