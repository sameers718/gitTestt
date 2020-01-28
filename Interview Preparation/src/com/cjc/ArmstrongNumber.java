package com.cjc;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int no=153;
		
		int temp=no; int sum=0, rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(sum==no)
			System.out.println("Given number is Armstrong Number: "+no);
		else
			System.out.print("Given number is not Armstrong Number: "+no);
	}
}