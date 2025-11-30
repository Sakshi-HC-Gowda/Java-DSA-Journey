package Array;
import java.util.*;
public class Arr1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};//static input
		int arr[]=new int[5];//dynamic input
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the"+i+"index");
			arr[i]=in.nextInt();
			
		}
		for(int ele:arr) {
			System.out.println(ele);
		}

	}

}
