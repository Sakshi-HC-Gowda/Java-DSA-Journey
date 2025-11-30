package com;
//delete() , deleteCharAt()
public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java Programming is awesome");
		System.out.println(sb.delete(5, 10));
		StringBuffer sb1=new StringBuffer("Python is super");
		System.out.println(sb1.deleteCharAt(10));

	}

}
