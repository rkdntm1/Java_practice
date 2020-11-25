package day3;

abstract class Sample //추상클래스 -> 객체 생성 x
{
	//	일반 메소드, 추상 메소드 다 같이 사용가능
	public void prt() //일반 메소드
	{
		System.out.println("prt");		
	}
	public abstract void view();  //추상 메소드
}

//추상클래스 객체 만드려면 일반 클래스에서 상속
class  Sample1 extends Sample
{
	@Override //몸통 만들기 -> 오버라이딩
	public void view() {
		System.out.println("view");
	}
}


public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ins = new Sample1();  // ins - 참조변수, new - 객체생성 
		ins.prt();
		ins.view();
		
		

	}

}
