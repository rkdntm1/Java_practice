package day1;

class Person // class 클래스이름(앞 대문자)
{
	String name; //멤버 변수
	int age;
	//메서드 (동작 )
	void a() //함수 메서드 리턴값이 없을때 void 
	{
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test3");
	}
	int[] doing2()
	{
		int[] arr = {10, 20, 30, 40};
		System.out.println("doing2");
		return arr;
	}
	
	int doing1()
	{
		System.out.println("doing1");
		return 10;
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); 
		p1.name = "hong"; //인스턴스 변수
		p1.age = 20;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.a(); //메서드 호출
		p1.doing1(); //리턴은 되었으나 값을 받지 않음
		int su = p1.doing1(); //메소드 return 값 받기
		System.out.println(su);
		int[] su1= p1.doing2();
		System.out.println(su1[1]);
		
	}

}
