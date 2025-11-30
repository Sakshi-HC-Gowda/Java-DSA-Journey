package com;
import java.util.Scanner;
public class ArraySortedorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		 System.out.println("Enter " + n + " elements:");
	     for (int i = 0; i < n; i++) {
	         arr[i] = sc.nextInt();
	     }
	     for (int i = 0; i < n - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                System.out.println("Not sorted");
	               
	                return;
	            }
	        }
	     System.out.println("Sorted");
	      
	    }
	}

