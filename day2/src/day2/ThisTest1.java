package day2;


class This1 // 클래스
{
	public This1() // 생성자 오버로딩 // no-argument constructor
	{
		System.out.println("no-argument constructor");
	}
	public This1(String name)// 생성자 오버라이딩
	{
		this(); // 생성자호출
		System.out.println("name arg constructor");
	}
	public This1(int age)
	{
		System.out.println("This age arg constructor");
	}
	public This1(String name, int age)// 생성자 오버로딩
	{
		this("aaa"); //생성자호출
//		this(10); -> 오류)여러개의 생성자 호출이 불가능하다.
		System.out.println("This1 name, age argment constructor");
	}
	public This1(String name, int age, String addr)// 생성자 오버로딩
	{
		this("aa", 10); //생성자 호출
		System.out.println("This1 age argument constructor");
	}
}

public class ThisTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1 ins = new This1("aaa",10, "bbb");
		
	}

}
