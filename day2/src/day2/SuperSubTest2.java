package day2;

/*
 * �޼��� �������̵�(method overriding) => ������
 * : �θ�Ŭ�������� ������ �޼��带 �ڽ� Ŭ�������� �ٽ� ���� �� ��.
 * 
 * -�θ𿡼� ������ �޼����� �̸�, �Ű����� Ÿ��, ����, ������ ���ƾ�
 * -����Ÿ�Ե� ���ƾ�
 * -���������� ����: 
 * -Exception ����: 
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
	public void prt() //��ӹ��� �θ�� �Ȱ��� �޼��� �ۼ��� ���� �߻�  x //method override
	{
		System.out.println("sun2- prt");
	}
}


public class SuperSubTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 ins1 = new Sub2();
		ins1.prt();
		ins1.view(); //super2- prt �� ���۾ȵǰ� sun2- prt �۵�

	}

}
