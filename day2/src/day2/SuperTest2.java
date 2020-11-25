package day2;

class Test1
{
	public Test1()
	{
		System.out.println("Test1");
	}
}
class Test2 extends Test1
{
	public Test2()
	{
		//super(); // 부모 생성자 호출 (보통 생략되어있음) 
		System.out.println("Test2");
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 ins = new Test2();
		

	}

}
