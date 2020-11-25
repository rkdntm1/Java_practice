package day2;
/*
 * static 변수
 * 변수 선언 앞에 static
 * 클래스 로딩시 메모리 할당
 * 사용방법 : 클래스 이름.변수
 * 
 * static 메서드
 * 메서드 선언 앞에 static
 * 사용방법 : 클래스이름.메서드
 * =>지역변수, 클래스변수
 * =>단, 인스턴스변수는 안됨(?-> 객체생성시에 할당되기 때문에. static메서드는 그전에 만들어짐)
 */

class StaticMethod1
{
	public static int staticsu2 = 200; 
	public int instancesu3 = 20;
	
	public void doing1() //
	{
		System.out.println("doing1 method");		
		System.out.println(staticsu2);
		System.out.println(instancesu3);
	}
	public static void doing2() //static 메서드
	{
		int localsu = 100;
		System.out.println("doing2 static method");
		System.out.println("locasu: " + localsu);
		System.out.println("staticsu2 : " + staticsu2);
		//System.out.println("instancesu3: " + instancesu3);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 ins = new StaticMethod1();
		ins.doing1();
		StaticMethod1.doing2(); 

	}

}
