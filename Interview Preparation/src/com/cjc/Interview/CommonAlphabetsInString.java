package com.cjc.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonAlphabetsInString {
	
	public static void main(String[] args) {
		
		String str1="thin sticks";
		String str2=" thick bricks";
		
		/*str1=str1.concat(str2);
		System.out.println(str1);
		
		char[] c=str1.replaceAll("\\s", "").toCharArray();
		ArrayList<Character> al=new ArrayList<>();
		Arrays.sort(c);
		Set<Character> s=new LinkedHashSet<>();
		
		for(Character c1:c)
		{
			if(!s.contains(c1))
			{
				s.add(c1);
			}
		}
		System.out.println(s);*/
		
		char[] c1=str1.replaceAll("\\s", "").toCharArray();
		char[] c2=str2.replaceAll("\\s", "").toCharArray();
		
		/*Arrays.sort(c1);
		Arrays.sort(c2);*/
		
		System.out.println(c1);
		System.out.println(c2);
		Set<Character> s1=new TreeSet<>();
		Set<Character> s2=new TreeSet<>();
		
		for(char ch1:c1)
		{
			s1.add(ch1);
		}
		for(char ch2:c2)
		{
			s2.add(ch2);
		}
		
		s1.retainAll(s2);
		System.out.println("Common character: "+s1);
		
	}
}
