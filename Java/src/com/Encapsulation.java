package com;
class Person{
	private String name;

public String getName() {
	return name;
}
public void setName(String newName) {
	name=newName;
}}
public class Encapsulation {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Sakshi");
		System.out.println(p.getName());

	}
}
