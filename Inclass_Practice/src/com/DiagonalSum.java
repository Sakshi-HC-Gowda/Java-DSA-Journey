package com;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		int left_sum=0;
		int right_sum=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		 System.out.println("Enter elements:");
	     for (int i = 0; i < n; i++) {
	    	 for (int j = 0; j< n; j++) {
	         matrix[i][j] = sc.nextInt();
	    	 if(i==j) {
	    		 left_sum+=matrix[i][j];
	    	 }
	    	 if(i+j==2){
	    	 right_sum+=matrix[i][j];
	    	 }}}
	    	 
	    	 System.out.println("Primary diagonal:"+left_sum);
	    	 System.out.println("Secondary diagonal:"+right_sum);
	    	 }}

	    
