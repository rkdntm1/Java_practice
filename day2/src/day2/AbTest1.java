package day2;
/*
 *  Ŭ���� �տ� abstract => �߻�Ŭ����
 *  ->instance ������ ���ϴ� Ŭ����
 *  �޼��� �տ� abstract => �߻�޼���
 *  ->���� �ִ� �޼��� ... body�� ����
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
