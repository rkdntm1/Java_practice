package day2;
/*
 *  클래스 앞에 abstract => 추상클래스
 *  ->instance 생성을 못하는 클래스
 *  메서드 앞에 abstract => 추상메서드
 *  ->선언만 있는 메서드 ... body가 없음
 *  
 */


abstract class Ab1
{
	public void prt()
	{
		System.out.println("ab1 prt method");
	}
	public abstract void area();
}
class Ab2 extends Ab1
{
	public void view()
	{
		System.out.println("a2 view method");
	}
	@Override
	public void area() {
		System.out.println("a2-area!!!");
	}
	
}



public class AbTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ab1 ins = new Ab1();
		ins.prt();*/
		

	}

}
