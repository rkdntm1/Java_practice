package day2;


class Sample1
{
	public void prt()
	{
		System.out.println("Sample1-prt");
	}
	public void view()
	{
		System.out.println("Sample1-view");
	}
}
class Sample2 extends Sample1
{
	@Override
	public void prt()
	{
		System.out.println("Sample2-prt");
	}
	public void draw()
	{
		System.out.println("Sample2-draw");
	}
}

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample1 ins = new Sample1();
//		ins.prt();
//		ins.view();
//		
//		System.out.println("=========");
//		
//		Sample2 ins2 = new Sample2();
//		ins2.view();
//		ins2.prt();
//		ins2.draw();
//		
//		Sample1 ins3 = new Sample2();
//		ins3.prt();
//		ins3.view();
		//ins3.draw(); //Sample1에서는 prt 와 view 밖에 가르킬수 없음
		//Sample2 ins4 =(Sample2) new Sample1(); //java.lang.ClassCastException
		
		Sample1 ins = new Sample2();
		Sample2 ins2 = (Sample2)ins;
		//ins2 .... 메서드가 어떤것인지...
		ins2.prt();
		ins2.view();
		ins2.draw();
		
 
		
		
		

	}

}
