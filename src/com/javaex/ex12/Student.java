package com.javaex.ex12;

public class Student extends Person{

	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		super();
		System.out.println("Student()");	
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 -gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드 -일반
	public void showInfo() {
		System.out.print("학교: "+this.schoolName+", ");
		//부모toString()그대로 사용
		super.showInfo(); //*super this 구분
	}
	
	@Override
	public String toString() {
		return "Student [schoolName= " + schoolName +", getName()=" + super.getName() + ", getAge()=" + super.getAge() + "]";
	}
	
	
	
	
	
}
