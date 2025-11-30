package com;

import java.util.*;

public class Queue2 {

	public static void main(String[] args) {
		Queue<Integer> s=new PriorityQueue<>();
		s.add(0);s.add(-2);s.add(5);
		s.add(1);s.add(2);s.add(4);
		s.add(3);s.add(-6);s.add(-1);
		
		System.out.println(s);

	}

}
