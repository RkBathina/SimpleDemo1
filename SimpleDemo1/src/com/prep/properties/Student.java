package com.prep.properties;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Student {
	
	
	int id;
	String name;
	Date dob;
	String email;
	String mobile;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Date dob, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, dob, email, mobile);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return  id == other.id&&
//				Objects.equals(name, other.name)&&
//				Objects.equals(dob, other.dob) && 
//				Objects.equals(email, other.email) && 
//				Objects.equals(mobile, other.mobile);
//				
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return Integer.compare(this.id, o.id);
//	}
	
	

}
