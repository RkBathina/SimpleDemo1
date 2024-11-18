package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<>();
		s.add(new Student("Kittu", 100, 'A'));
		s.add(new Student("Bathina", 101, 'B'));
		s.add(new Student("Pandu", 102, 'C'));
		
		List<Student> s1 = new ArrayList<>();
		s1.add(new Student("Sai", 103, 'B'));
		s1.add(new Student("Rama", 104, 'A'));
		s1.add(new Student("Nag", 105, 'C'));
		
		List<Student> s2 = new ArrayList<>();
		s2.add(new Student("Lak", 106, 'C'));
		s2.add(new Student("Vis", 107, 'A'));
		s2.add(new Student("Bab", 108, 'B'));
		
		List<List<Student>> ss= Arrays.asList(s, s1, s2);
		System.out.println(ss);
		
		//without streams
		for (List<Student> list : ss) {
			for (Student list2 : list) {
				System.out.println(list2.sname);
			}
		}
		
		System.out.println();
		//with streams
		List<String> stud = ss.stream()
				.flatMap(n -> n.stream())
				.map(nam -> nam.sname)
				.collect(Collectors.toList());
		System.out.println(stud);
	}

}

class Student{
	String sname;
	int sid;
	char grade;
	public Student(String sname, int sid, char grade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "[sname=" + sname + ", sid=" + sid + ", grade=" + grade + "]";
	}
	
	
}