package com.kita;

/*
 * default : ���� ��Ű�� ������ ���� , 
 * protected : ���� ��Ű�� ������ ����, �ٸ� ��Ű�������� ��Ӱ��迡�� ���� ����
 * 
 */
public class Person {
	private String name;
	protected int age; //protected 
	String addr=  "���� "; //default

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
