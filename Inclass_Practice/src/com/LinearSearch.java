package com;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		 System.out.println("Enter " + n + " elements:");
	     for (int i = 0; i < n; i++) {
	         arr[i] = sc.nextInt();
	     }
	     System.out.println("Enter the key");
			int key=sc.nextInt();
	     for (int i = 0; i < n; i++) {
	    	 if(arr[i]==key) {
	    		 System.out.println(i);
	    	 }
	    	 System.out.println();
	     }
	}
}
