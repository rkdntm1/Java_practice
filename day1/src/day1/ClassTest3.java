package day1;

class Person3
{
	String name; //�������
	
	void doing3(int su, int su2) // ���� �ޱ����� ������ ���ξȿ��� ����! //su, su2 ->�Ű�����, ��������
	{
		System.out.println("<doing3>");
		System.out.println("su: " + su);
		System.out.println("su2: " + su2);
	}
	int add(int a, int b, int c)
	{
		System.out.println("<<add-method>>");
		return a+b+c;
	}
	int[] getJumsu(String name, int age, String gen) //�Ű�����
	{
		//db����
		//jumsu�˻�
		/*int[] jumsu = new int[3]; 
		jumsu[0] = 100;
		jumsu[1] = 60; 
		jumsu[2] = 50;
		return jumsu;*/
		
		System.out.println("name: "+ name + ", age: "+ age+ ", gen: "+ gen);
		
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 90;
		arr[2] = 80;
		return arr;
				
	}
}

public class ClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person3 ins = new Person3(); // ins : �ν��Ͻ� ����, main������ ���������� �������� 
		ins.doing3(10,20); //���� �Ѱ���
		int result = ins.add(10, 20, 30);
		System.out.println("result: "+ result);
		
		int[] arr = ins.getJumsu("����",20,"��");
		System.out.println("======main���� ======");
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		
		

	}

}
