package day2;

/*
 *  ����Ұ���
 * final ���� : ��������, �ν��Ͻ� - > final ���� -> ���
 * final �޼��� : �������̵� �Ұ�
 * 
 * final Ŭ���� : ��� �Ұ�, �ڽ��� ���� Ŭ���� => ����Ŭ����
 * 
 * 
 */

class Finalmethod1
//final class Finalmethod1 //final class �� ���
{
	public final void prt()
	{
		System.out.println("Finalmethod1-prt");
	}
}

class Finalmethod2 extends Finalmethod1
//class Finalmethod2 extends Finalmethod1 //�θ� Ŭ������ final�� ������ ��� x -> ����
{
	/*@Override
	public void prt() //�θ� Ŭ������ final �޼��� �� �������̵� �Ұ� -> ����
	{
		System.out.println("Finalmethod2-prt");
	}*/
	
}
public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
