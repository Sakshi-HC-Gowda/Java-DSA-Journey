package com;

public class ASCIIValue {

	public static void main(java.lang.String[] args) {
		String x="Sakshi.23cs130@sode-edu.in";
		int c=0;
		int s=0;
		int num=0;
		int space=0;
		int special=0;
		
		for(int i=0;i<x.length();i++) {
			 char ch=x.charAt(i);
			if(ch>=65 &&ch<=90) {
				c++;
				}
			
			
			if(ch>=97 && ch<=122) {
				s++;
			}
			if(ch>=48&&ch<=57) {
				num++;
			}
			if(ch==' ') {
				space++;
				
				}
			if(!((ch>=65 &&ch<=90)||(ch>=97 && ch<=122)||(ch>=48&&ch<=57)||ch==' ')) {
			special++;
			}
		}
		System.out.println("Capital letters:"+c);
		System.out.println("Small letters: " + s);
        System.out.println("Digits: " +num);
        System.out.println("Spaces: " + space);
        System.out.println("Special characters: " + special);
	}}


