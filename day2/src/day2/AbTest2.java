package day2;

abstract class Abclass1
{
	public void prt() //추상메서드가 있는 클래스는 추상클래스
	{
		System.out.println("prt");
	}
    public abstract void view();
}

class Abclass2 extends Abclass1
{
	@Override
	public void view() {
		System.out.println("view");
	}
}

public class AbTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abclass1 ins = new Abclass1();
		Abclass2 ins = new Abclass2();
		ins.prt();
		ins.view();

	}

}
