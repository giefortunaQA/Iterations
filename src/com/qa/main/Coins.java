package com.qa.main;

public class Coins {
	
	//Change
	public void change(double cost, double payment) {
		double[] myDenom= {20,10,5,1,0.5,0.2,0.1};
		int len=myDenom.length;
		int[] qty= {0,0,0,0,0,0,0};
		double change=payment-cost;
		
		for (int i=0;i<len-1;i++) {
			int howMany=(int) (change/myDenom[i]);
			qty[i]=howMany;
			change-=howMany*myDenom[i];
			System.out.println((String)("£" +myDenom[i] +" : " + qty[i]));
		}
	}
	
	
}
