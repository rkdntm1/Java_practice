package day1;

/*
 * �޼��� �����ε�
 * 	:Ŭ���� ������ �̸��� ���� �޼��带 ������ ���� �� �� �ִ�.
 *  
 *  Ŭ���������� �޼��� �̸��� ������ 
 *  �Ű����� Ÿ��, ����, ������ �ٸ��� �ٸ� �޼���� �ν�
 *  ��, ���� Ÿ�԰��� �����ϴ�.
 *  
 *  void prt(String name){}
	=> �޼��� ȣ��� : obj.prt("aaa");
========================
	int prt(String name){}
	
	�޼��� ȣ���
	1. obj.prt("aaa");
	2. int su= obj.prt("aaa");
 
 * 
 */

class Sample
{
	//�̸��� ���Ҵµ��� ������ x : �޼ҵ� �����ε�
	public void prt()	{			}
	public void prt(int age)	{			}
	public void prt(String name) {}
	public void prt(String name, int age) {}
	public void prt(String age, String name) {}
	//public void prt(String age, String addr) {} // -- �޼��� �����ε��� �ȵ�
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ins = new Sample();
		ins.prt("aaa", "bbb");

	}

}
