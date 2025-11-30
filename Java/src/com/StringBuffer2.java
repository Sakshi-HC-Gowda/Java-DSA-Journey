package com;
//reverse() , replace()
public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java Programming is awesome");
		System.out.println(sb.replace(5, 16, "python"));
		System.out.println(sb.reverse());
	}

}
