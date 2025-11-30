package Searching_Sorting;

public class Com {

	public static void main(String[] args) {
		int arr[]= {50,30,40,10,20};
		bubblesort(arr);
		Insertionsort(arr);
		dis(arr);

	}
	public static void bubblesort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void Insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			while(i>0&&arr[i]<arr[i-1]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					i--;
				}
			}
	}
	public static void dis(int arr[]) {
		for(int ele:arr) {
			System.out.print(ele+" ");
	}

}
}


