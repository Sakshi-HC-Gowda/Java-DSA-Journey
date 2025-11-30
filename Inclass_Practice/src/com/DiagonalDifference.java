package com;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		 System.out.println("Enter elements:");
	     for (int i = 0; i < n; i++) {
	    	 for (int j = 0; j< n; j++) {
	        matrix[i][j] = sc.nextInt();
	    	 }
}
	     int primaryDiagonalSum = 0;
int secondaryDiagonalSum = 0;

for (int i = 0; i < n; i++) {
    primaryDiagonalSum += matrix[i][i];               
    secondaryDiagonalSum += matrix[i][n - 1 - i];
}

int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
System.out.println(difference);}}
