package com.qa.main;

public class Numbers{ 
	//1
	public void digitAdd(int num) {
		
		if (num>=10 && num<=99) {
			int digitSum=(int)(num/10)+num%10;
			System.out.println(digitSum);
		}
		else {
			System.out.println("Numbers invalid.");
		}
	}
	
	//2 1-99
	
	public String numToString1(int num) {
		String[] ones= {"", "one", "two", "three", "four", "five","six","seven","eight","nine"};
		String[] tens= {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ", "ninety "};
		String[] special= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		int numOnes = num %10;
		int numTens= (int)(num/10);
		boolean isEasy= (num>=0 && num <10 || num>19 && num <100);
		boolean isSpecial=(num>9 && num<20);
		String out = null;
		
		if (isEasy) {
			out=tens[numTens]+ones[numOnes];
			return out;
		}
		else if (isSpecial) {
			out=special[num%10];
			return out;
		}
		return out;
	}
	
	
	//3. 1-999
	public String numToString2(int num) {
		String out=null;
		int numHund=(int)(num/100);
		if (num<100) {
			out=numToString1(num);
			return out;
		}
		else if (num>99 && num<1000) {
			out=numToString1(numHund)+" hundred "+numToString1(num%100);
			return out;
		}
		return out;
	}
	
	//4.1-9999
	public String numToString3(int num) {
		String out=null;
		int numThou=(int)(num/1000);
		if (num<1000) {
			out=numToString2(num);
			System.out.println(out);
		}
		else if (num>999 && num<10000) {
			out=numToString1(numThou)+ " thousand " +numToString2(num%1000);
			System.out.println(out);
		}
		return out;
	}
	
}
