package com.qa.main;

public class Coins {
	
	//Change- can change return type to void
	public String change(double cost, double payment) {
		double[] myDenom= {20,10,5,1,0.5,0.2,0.1,0.05,0.02,0.01};
		int len=myDenom.length;
		int[] qty= {0,0,0,0,0,0,0};
		double change=payment-cost;
		
		for (int i=0;i<len-1;i++) {
			int howMany=(int) (change/myDenom[i]);
			qty[i]=howMany;
			change-=howMany*myDenom[i];
			System.out.println((String)("£" +myDenom[i] +" : " + qty[i]));
		}
		return qty.toString();
	}
	
	//without using arrays (attempt)
	public String change2(double cost, double payment) {
		String output="";
		double change=payment-cost;
		int count20=0;
		int count10=0;
		int countFiver=0;
		int countQuid=0;
		int count50P=0;
		int count20P=0;
		int count10P=0;
		int count5P=0;
		int count2P=0;
		int countPenny=0;
		
		count20+=(int)(change/20);
		change-=count20*20;
		count10+=(int)(change/10);
		change-=count10*10;
		countFiver+=(int)(change/5);
		change-=countFiver*5;
		countQuid+=(int)(change/1);
		change -=countQuid;
		count50P+=(int)(change/0.5);
		change-=count50P*0.5;
		count20P+=(int)(change/0.2);
		change -=count20P*0.2;
		count10P+=(int)(change/0.1);
		change-=count10P*0.1;
		count5P+=(int)(change/0.05);
		change-=count5P*0.05;
		count2P+=(int)(change/0.02);
		change-=count2P*0.02;
		countPenny+=(int)(change/0.01);
		change-=countPenny*0.01;
		System.out.println((String)("20s: " + count20));
		System.out.println((String)("10s: " + count10));
		System.out.println((String)("5s: " + countFiver));
		System.out.println((String)("pound coins: " + countQuid));
		System.out.println((String)("50p: " + count50P));
		System.out.println((String)("20p: " + count20P));
		System.out.println((String)("10p: " + count10P));
		System.out.println((String)("5p: " + count5P));
		System.out.println((String)("2p: " + count2P));
		System.out.println((String)("1p: " + countPenny));
		return output;
	}
	
	
}
