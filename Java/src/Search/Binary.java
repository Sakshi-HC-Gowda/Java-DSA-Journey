package Search;

public class Binary {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int s=0,e=arr.length-1;
		int tar=5;
		while(s<=e)
		{
		int mid=(s+e)/2;
		if(tar>arr[mid])
		s=mid+1;
		else if(tar<arr[mid])
		e=mid-1;
		else if(tar==arr[mid]) {
		System.out.println(mid);break;
		}}}}
