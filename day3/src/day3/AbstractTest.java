package day3;

abstract class Sample //�߻�Ŭ���� -> ��ü ���� x
{
	//	�Ϲ� �޼ҵ�, �߻� �޼ҵ� �� ���� ��밡��
	public void prt() //�Ϲ� �޼ҵ�
	{
		System.out.println("prt");		
	}
	public abstract void view();  //�߻� �޼ҵ�
}

//�߻�Ŭ���� ��ü ������� �Ϲ� Ŭ�������� ���
class  Sample1 extends Sample
{
	@Override //���� ����� -> �������̵�
	public void view() {
		System.out.println("view");
	}
}


public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ins = new Sample1();  // ins - ��������, new - ��ü���� 
		ins.prt();
		ins.view();
		
		

	}

}
