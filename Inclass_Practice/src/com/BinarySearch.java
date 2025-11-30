package com;

import java.util.Scanner;

public class BinarySearch {

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
			
			int start=0,end=n-1;
			int foundIndex=-1;
			while (start <= end) {
	            int mid = start + (end - start) / 2;
	     
	    	 if(arr[mid]==key) {
	    		 foundIndex = mid;
	                break;
	            } else if (arr[mid] < key) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        if (foundIndex != -1) {
	            System.out.println("Key found at index: " + foundIndex);
	        } else {
	            System.out.println("Key not found.");
	        }}}

