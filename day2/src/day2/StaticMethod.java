package day2;
/*
 * static ����
 * ���� ���� �տ� static
 * Ŭ���� �ε��� �޸� �Ҵ�
 * ����� : Ŭ���� �̸�.����
 * 
 * static �޼���
 * �޼��� ���� �տ� static
 * ����� : Ŭ�����̸�.�޼���
 * =>��������, Ŭ��������
 * =>��, �ν��Ͻ������� �ȵ�(?-> ��ü�����ÿ� �Ҵ�Ǳ� ������. static�޼���� ������ �������)
 */

class StaticMethod1
{
	public static int staticsu2 = 200; 
	public int instancesu3 = 20;
	
	public void doing1() //
	{
		System.out.println("doing1 method");		
		System.out.println(staticsu2);
		System.out.println(instancesu3);
	}
	public static void doing2() //static �޼���
	{
		int localsu = 100;
		System.out.println("doing2 static method");
		System.out.println("locasu: " + localsu);
		System.out.println("staticsu2 : " + staticsu2);
		//System.out.println("instancesu3: " + instancesu3);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 ins = new StaticMethod1();
		ins.doing1();
		StaticMethod1.doing2(); 

	}

}
