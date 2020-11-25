package com.kita;

public class PersonTest extends Person{
	public PersonTest(String name, int age) {
		super(name, age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new  Person("name", 10);
		//PersonTest p1 = new PersonTest("ȫ�浿", 20);
			System.out.println(p1.addr);
			System.out.println(p1.age);
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
				
				

	}

}
