package day2;

/*
 * static ����
 * => Ŭ���� ����, �������� , static ����
 * => ��������
 * => ��ü�� �����ϰ� ���Ǵ� ����
 * => ����) Ŭ���� �̸�.����
 * => �޼��� ������ �޸� ����
 */

class Static1
{
	 public int su1; // �ν��Ͻ� ����
	 public static int su2; // Ŭ�������� = �������� = static����
	 public static final int data = 30;
	 
	 
}


public class staticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 ins1 = new Static1();
		ins1.su1 = 100;
		ins1.su2 = 500;
		
		System.out.println("========");
		Static1 ins2 = new Static1();
		ins2.su1 = 200;
		ins2.su2 = 1000;
		
		
		System.out.println(ins1.su1+ ", "+ins2.su1+",");
		System.out.println(ins1.su2+ ", "+ins2.su2+","+Static1.su2);
		
		System.out.println(Static1.data);
	//	Static.data  = 10;
	}

}
