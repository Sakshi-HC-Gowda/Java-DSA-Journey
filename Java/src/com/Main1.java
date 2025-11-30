package com;

public class Main1 {

	public static void main(String[] args) {
		call(0);

	}
	public static void call(int n) {
		if(n==10) {
			return;
		}
		else {
			System.out.println("Sakshi");
			call(n+1);
		}
	}

}
