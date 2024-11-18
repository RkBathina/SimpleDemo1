package com.prep.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
	List<Student1> studs = 	Arrays.asList(
			new Student1("Kittu", 34), 
			new Student1("Bathina", 79),
			new Student1("Pandu", 99),
			new Student1("Sai", 29),
			new Student1("Vish", 53),
			new Student1("Bab", 46),
			new Student1("Nag", 65)
			);
	System.out.println(studs);
	//using stream -> sequential
	List<Student1> s = studs.stream().filter(n -> n.getScore()>=40).limit(3).collect(Collectors.toList());
	System.out.println(s);
	
	//Parallel strea,
	studs.parallelStream().filter(n -> n.getScore()>=40).limit(3).forEach(n -> System.out.println(n));
	
	// convert stream to parallel stream
	studs.stream().parallel().filter(n -> n.getScore()>=40).limit(3).forEach(n -> System.out.println(n));
	}

}

class Student1{
	String name;
	int score;
	
	Student1(String name, int score){
		this.name = name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", score=" + score + "]";
	} 
	
	
}
