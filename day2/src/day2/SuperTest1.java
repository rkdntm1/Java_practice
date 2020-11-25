package day2;


class S1
{
	public void prt()
	{
		System.out.println("s1 prt");
	}
}
class S2 extends S1
{
	public void prt()
	{
		System.out.println("s2 prt");
	}
	public void test()
	{
		prt();  //this를 생략해서도 사용가능, 
		//this.prt(); //메서드 호출 
		super.prt(); //super - 부모를 의미 , super로 부모 클래스 메서드에 접근 가능
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 ins = new S2();
		ins.prt();
		ins.test();
		System.out.println("============");

	}

}
