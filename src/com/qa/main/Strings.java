package com.qa.main;

public class Strings {

	// method 1
	public void count(String input) {
		String[] output=input.split(" ");
		int count=output.length;
		System.out.println(count);
	
	}
	
	//method2
	public void vertical(String input) {
		int len=input.length();
		for (int i=0; i<len;i++) {
			System.out.println(input.charAt(i));
		}
	}
	
	//method 3
	public void reverseVertical(String input) {
		int len=input.length();
		for (int i=0; i<len;i++) {
			int j=len-i-1;
			System.out.println(input.charAt(j));
		}
	}
	
	//method 4
	public boolean isInMessage(String message, String filter) {
		boolean answer= message.contains(filter);
		System.out.println(answer);
		return answer;
	}
}
