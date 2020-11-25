package day2;

/*
 * 메서드 오버라이딩(method overriding) => 재정의
 * : 부모클래스에서 정의한 메서드를 자식 클래스에서 다시 정의 한 것.
 * 
 * -부모에서 정의한 메서드의 이름, 매개변수 타입, 순서, 갯수가 같아야
 * -리턴타입도 같아야
 * -접근지정자 관점: 
 * -Exception 관점: 
 *
 */
class Super2
{
	public void prt()
	{
		System.out.println("super2- prt");
	}
}
class Sub2 extends Super2
{
	public void view()
	{
		System.out.println("sub2- view");
	}
	@Override //annotation
	public void prt() //상속받은 부모와 똑같은 메서드 작성시 오류 발생  x //method override
	{
		System.out.println("sun2- prt");
	}
}


public class SuperSubTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 ins1 = new Sub2();
		ins1.prt();
		ins1.view(); //super2- prt 가 동작안되고 sun2- prt 작동

	}

}
