package day1;

class Person2
{
	String studentno; //�������
	
	String doing1()
	{
		String name = "hong gil dong"; // ��������(local variable)
		System.out.println("<doing1>");
		return name;
	}
	int[] doing2()
	{
		int[] arr = {10, 20 , 30};
		System.out.println("<doing2>");
		return arr;
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main���� doing1�޼���� doing2�޼��� ȣ���ؼ� �� ���
		Person2 obj1 = new Person2();
		
		String irum = obj1.doing1();
		System.out.println(irum);
		System.out.println("----------");
		
		int[] result = obj1.doing2();		
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
		

	}

}
