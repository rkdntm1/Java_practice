package day2;
/*
 * static �ʱ�ȭ ���
 * static{
 * 
 * }
 * Ŭ���� �ε��ÿ� 1�� ȣ��
 * 
 */


class Static2
{
	public final static int[] su;
	//�ʱ�ȭ ��
	static {
		System.out.println("static �ʱ�ȭ ���");
		su = new int[4];
		for(int i=0; i<su.length; i++)
			su[i] = i*10;
		
	}
	{
		System.out.println("���");				
	}
	public Static2()
	{
		System.out.println("��ü ���� - ������");
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static2 ins = new Static2();
		System.out.println("=====");
		Static2 ins2 = new Static2();
		
		int[] result = Static2.su;
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);

	}

}
