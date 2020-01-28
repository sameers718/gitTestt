package com.ComparableNdComparator;

import java.util.TreeSet;

public class ComparableNdComparatorTest {

	public static void main(String[] args) {
		
		Student stud1=new Student(10);
		Student stud2=new Student(12);
		Student stud3=new Student(11);
		Student stud4=new Student(15);
		Student stud5=new Student(14);
		
		TreeSet<Student> t1=new TreeSet<>();
		t1.add(stud1);
		t1.add(stud2);
		t1.add(stud3);
		t1.add(stud4);
		t1.add(stud5);
		
		System.out.println(t1);
		
		Employee emp1=new Employee("madhukar");
		Employee emp2=new Employee("sameer");
		Employee emp3=new Employee("prathamesh");
		Employee emp4=new Employee("shrikant");
		Employee emp5=new Employee("Aditya");
	
		TreeSet<Employee> t2=new TreeSet<>(new Employee(""));
		t2.add(emp1);
		t2.add(emp2);
		t2.add(emp3);
		t2.add(emp4);
		t2.add(emp5);
		
		System.out.println(t2);
	}
}
