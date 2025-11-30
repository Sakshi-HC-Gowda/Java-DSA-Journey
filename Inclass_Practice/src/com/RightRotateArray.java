package com;

import java.util.Scanner;

public class RightRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		 System.out.println("Enter " + n + " elements:");
	     for (int i = 0; i < n; i++) {
	         arr[i] = sc.nextInt();
	     }
	  // Step 1: Store the last element
	        int last = arr[n-1];

	        // Step 2: Shift elements left by one
	        for (int i = n - 1; i > 0; i--) {
	            arr[i] = arr[i-1];
	        }

	        // Step 3: Place the first element at the end
	        arr[0] = last;

	        // Output: Rotated array
	        System.out.println("Array after right rotation by one:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	}

}
