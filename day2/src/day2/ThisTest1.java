package day2;


class This1 // Ŭ����
{
	public This1() // ������ �����ε� // no-argument constructor
	{
		System.out.println("no-argument constructor");
	}
	public This1(String name)// ������ �������̵�
	{
		this(); // ������ȣ��
		System.out.println("name arg constructor");
	}
	public This1(int age)
	{
		System.out.println("This age arg constructor");
	}
	public This1(String name, int age)// ������ �����ε�
	{
		this("aaa"); //������ȣ��
//		this(10); -> ����)�������� ������ ȣ���� �Ұ����ϴ�.
		System.out.println("This1 name, age argment constructor");
	}
	public This1(String name, int age, String addr)// ������ �����ε�
	{
		this("aa", 10); //������ ȣ��
		System.out.println("This1 age argument constructor");
	}
}

public class ThisTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1 ins = new This1("aaa",10, "bbb");
		
	}

}
