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
		prt();  //this�� �����ؼ��� ��밡��, 
		//this.prt(); //�޼��� ȣ�� 
		super.prt(); //super - �θ� �ǹ� , super�� �θ� Ŭ���� �޼��忡 ���� ����
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
