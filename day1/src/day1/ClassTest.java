package day1;

class Person // class Ŭ�����̸�(�� �빮��)
{
	String name; //��� ����
	int age;
	//�޼��� (���� )
	void a() //�Լ� �޼��� ���ϰ��� ������ void 
	{
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test3");
	}
	int[] doing2()
	{
		int[] arr = {10, 20, 30, 40};
		System.out.println("doing2");
		return arr;
	}
	
	int doing1()
	{
		System.out.println("doing1");
		return 10;
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); 
		p1.name = "hong"; //�ν��Ͻ� ����
		p1.age = 20;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.a(); //�޼��� ȣ��
		p1.doing1(); //������ �Ǿ����� ���� ���� ����
		int su = p1.doing1(); //�޼ҵ� return �� �ޱ�
		System.out.println(su);
		int[] su1= p1.doing2();
		System.out.println(su1[1]);
		
	}

}
