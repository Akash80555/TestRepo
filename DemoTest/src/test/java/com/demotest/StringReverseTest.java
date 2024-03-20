package com.demotest;

public class StringReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Akash";
		int len = Name.length();
		
		String Rev = "";
		
		for(int i=len-1; i>=0; i--) {
			Rev= Rev+Name.charAt(i);
		}
		System.out.println("Reverse Num" + Rev);
	}

		
	int Num = 12345;
	int RevNum = 0;

	{
	while(Num!=0) {
		int digit = Num%10;
		RevNum= RevNum*10+digit;
		Num/=10;
	}
	System.out.println("Number"+RevNum);
		
}
}