package com.kita;

/*
 * default : 같은 패키지 내에서 접근 , 
 * protected : 같은 패키지 내에서 접근, 다른 패키지에서는 상속관계에서 접근 가능
 * 
 */
public class Person {
	private String name;
	protected int age; //protected 
	String addr=  "서울 "; //default

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

}
