package day1;



/* ���� ������
 * private : Ŭ����������
 * 
 * public : ��ü����
 * =============================================================
 * => ������ Constructor : ��ü�� ���鶧 �ν��Ͻ� ������ �ʱ�ȭ �ϱ� ���� ����
 *    ������ : ��ü�� ��������鼭 �ڵ����� ȣ��
 *         : ���� Ÿ�� ����� �������
 *         
 *         Ŭ���� �̸�()
 *         {  
 *         
 *         }
 * 	        default ������(�⺻������)
 * 			:�����ڰ� ���� �����ڰ� �ƴ�
 * 			=>�����ڰ� ������ class ���� ������ �ڵ����� �߰��� ������
 * 			public class Ŭ����()
			{
	
			}
	 
 */

class Man
{
	private String name;
	private int age;
	
	// ������ �����ε�
	/*
	 * Ŭ���������� �̸��� ���� �����ڸ� ������ ���� �� �� �ִ�.
	 * ->�Ű������� Ÿ��, ����, ���� �� �ٸ��� -> �ٸ� �����ڷ� �ν�
	 */
	public Man(String name)
	{
		
	}
	public Man(int age)
	{
		
	}
	public Man(int age, String name)
	{
		
	}
	public Man(String name, int age)  
	{
		this.name=name;
		this.age =age;
	}
	public Man()
	{
		
	}
	
	public void prt()
	{
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
	}
	
	
	/*public Man() //������ -> ����Ÿ���� ���� ����
	{
		System.out.println("Man ������ ȣ��");
	}*/	
	
	//setter getter �ʿ��� -> �޼���
	
}

public class AccTest2 {
	public static void main(String[] args) {
		Man ins = new Man("hong",20);
		ins.prt();
		//Man ins = new Man(); //�����ڰ� �����ڸ� �̹� ���� default �����ڰ� ��� ���� �߻�.
		
	}

}
