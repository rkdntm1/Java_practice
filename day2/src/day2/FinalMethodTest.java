package day2;

/*
 *  변경불가한
 * final 변수 : 지역변수, 인스턴스 - > final 변수 -> 상수
 * final 메서드 : 오버라이딩 불가
 * 
 * final 클래스 : 상속 불가, 자식이 없는 클래스 => 종단클래스
 * 
 * 
 */

class Finalmethod1
//final class Finalmethod1 //final class 일 경우
{
	public final void prt()
	{
		System.out.println("Finalmethod1-prt");
	}
}

class Finalmethod2 extends Finalmethod1
//class Finalmethod2 extends Finalmethod1 //부모 클래스가 final이 붙으면 상속 x -> 오류
{
	/*@Override
	public void prt() //부모 클래스의 final 메서드 는 오버라이딩 불가 -> 오류
	{
		System.out.println("Finalmethod2-prt");
	}*/
	
}
public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
