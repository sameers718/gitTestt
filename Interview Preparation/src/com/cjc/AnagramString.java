package com.cjc;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1="madam".toLowerCase().replaceAll("\\s", "");
		String s2="damam".toLowerCase().replaceAll("\\s", "");
		
		boolean status=true;
		
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		else
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status=Arrays.equals(c1, c2);
		}
		if(status)
		{
			System.out.println("Given String is Anagram of another String: "+s1+" & "+s2);
		}
		else
		{
			System.out.println("Given String is not Anagram of another String: "+s1+" & "+s2);
		}
	}
}