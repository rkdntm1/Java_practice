package day2;

/* 부모클래스 = super 클래스
 * 자식클래스 - sub 클래스
 * 
 * class 자식클래스 extends 부모클래스 (상속받기)
 * 상속관계
 */

class Super1
{
	public void prt()
	{
		System.out.println("super1-prt메서드 ");
	}
	public void draw()
	{
		System.out.println("super1-draw메서드 ");
	}
}
class Sub1 extends Super1 	// 자식 : Sub1 , 부모 : Super1
{
	public void view()
	{
		System.out.println("sub1 view method");
	}
	public void write()
	{
		System.out.println("sub1 write method");
	}
}

public class SuperSubTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super1 ins = new Super1();
		ins.prt();
		ins.draw();
		
		System.out.println("===========");
		
		Sub1 ins2 = new Sub1();
		ins2.view();
		ins2.write();
		ins2.prt(); //상속
		ins2.draw(); //상속
		


	}

}
