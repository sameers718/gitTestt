package com.cjc.BuilderDesignPattern;

public class BuilderDesignPattern {
	
	public static void main(String[] args) {
		
		Phone p=new PhoneBuilder().setOs("Android").setBattery(5000).getPhone();
		System.out.println(p);
	}
}