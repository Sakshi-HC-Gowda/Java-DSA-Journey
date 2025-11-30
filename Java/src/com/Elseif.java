package com;

public class Elseif {

	public static void main(String[] args) {
		        String x = "Sakshi.23cs130@sode-edu.in";
		        int capital = 0;
		        int small = 0;
		        int digit = 0;
		        int space = 0;
		        int special = 0;

		        for (int i = 0; i < x.length(); i++) {
		            char ch = x.charAt(i);

		            if (ch >= 'A' && ch <= 'Z') {
		                capital++;
		            } else if (ch >= 'a' && ch <= 'z') {
		                small++;
		            } else if (ch >= '0' && ch <= '9') {
		                digit++;
		            } else if (ch == ' ') {
		                space++;
		            } else {
		                special++;
		            }
		        }

		        // Print results
		        System.out.println("Capital letters: " + capital);
		        System.out.println("Small letters: " + small);
		        System.out.println("Digits: " + digit);
		        System.out.println("Spaces: " + space);
		        System.out.println("Special characters: " + special);
		    }
		

	}
