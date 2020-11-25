package day1;

/*
 * 메서드 오버로딩
 * 	:클래스 내에서 이름이 같은 메서드를 여러개 정의 할 수 있다.
 *  
 *  클래스내에서 메서드 이름이 같으나 
 *  매개변수 타입, 순서, 갯수가 다를때 다른 메서드로 인식
 *  단, 리턴 타입과는 무관하다.
 *  
 *  void prt(String name){}
	=> 메서드 호출시 : obj.prt("aaa");
========================
	int prt(String name){}
	
	메서드 호출시
	1. obj.prt("aaa");
	2. int su= obj.prt("aaa");
 
 * 
 */

class Sample
{
	//이름이 같았는데도 에러가 x : 메소드 오버로딩
	public void prt()	{			}
	public void prt(int age)	{			}
	public void prt(String name) {}
	public void prt(String name, int age) {}
	public void prt(String age, String name) {}
	//public void prt(String age, String addr) {} // -- 메서드 오버로딩이 안됨
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ins = new Sample();
		ins.prt("aaa", "bbb");

	}

}
