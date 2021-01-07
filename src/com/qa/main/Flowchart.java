package com.qa.main;

public class Flowchart {
	//1
	public void flow1() {
		for (int A=100; A<=200; A++) {
			System.out.println("A");
		}
	}
	
	//2
	public void flow2() {
		for  (int A=100;A<201;A++) {
			if (A%2==0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
		}
	}
	
	//3
	public void tenTimes() {
		for (int i=1;i<11;i++) {

			for (int j=1;j<11;j++) {
				System.out.println(j);
			}
		}
	}
	
	//4. already used for loops 
	//5. 
	public void nTimes(int n) {
		for (int i=1;i<n+1;i++) {

			for (int j=1;j<11;j++) {
				System.out.println(j);
			}
		}
	}

}
