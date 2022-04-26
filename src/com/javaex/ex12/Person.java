package com.javaex.ex12;

public class Person {
	//필드
	private String name;
	private int age;
	
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	//메소드 일반	//html로 생각하세요(화면용)
	public void showInfo() {
		System.out.println("이름: "+name +", 나이: "+age);
	}
	
	
		
	@Override	//showInfo랑 다른애임(개발용)
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}
