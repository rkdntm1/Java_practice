package day2;

/* �θ�Ŭ���� = super Ŭ����
 * �ڽ�Ŭ���� - sub Ŭ����
 * 
 * class �ڽ�Ŭ���� extends �θ�Ŭ���� (��ӹޱ�)
 * ��Ӱ���
 */

class Super1
{
	public void prt()
	{
		System.out.println("super1-prt�޼��� ");
	}
	public void draw()
	{
		System.out.println("super1-draw�޼��� ");
	}
}
class Sub1 extends Super1 	// �ڽ� : Sub1 , �θ� : Super1
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
		ins2.prt(); //���
		ins2.draw(); //���
		


	}

}
