package Search;

public class Linear {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int tar=4;int p=0;int index=-1;
		for(int i=0;i<arr.length;i++){
		if(arr[i]==tar){
		index=i;
		p=1;
		break;}}
		if(p==1){
		System.out.println(tar + "Found  in the index" + index);
		}
		else
		System.out.println(tar+"Not found the index"+ index);  
		}}
