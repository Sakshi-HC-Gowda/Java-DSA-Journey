package com;

public class ManualAddition {

	public static void main(String[] args) {
		int a=55;int b=10;
		int c=0;
		if(a>0&&b>0) {
			while (b != 0) {
				int carry = a & b;     // Carry positions
				a = a ^ b;             // Sum without carry
				b = carry << 1;        // Carry shifted left
			}
			c = a;
		}

		System.out.println(c);

	}

}
