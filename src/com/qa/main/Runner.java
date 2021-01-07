package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
	
		Numbers num1=new Numbers();
		num1.numToString3(1106);
		
		for (int i=1; i<101; i++) {
			System.out.println(num1.numToString2(i));
		}
	}
}
