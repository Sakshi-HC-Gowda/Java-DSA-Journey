package com;

import java.util.Scanner;

public class LeftRotateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		 System.out.println("Enter " + n + " elements:");
	     for (int i = 0; i < n; i++) {
	         arr[i] = sc.nextInt();
	     }
	  // Step 1: Store the first element
	        int first = arr[0];

	        // Step 2: Shift elements left by one
	        for (int i = 0; i < n - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        // Step 3: Place the first element at the end
	        arr[n - 1] = first;

	        // Output: Rotated array
	        System.out.println("Array after left rotation by one:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}

}
