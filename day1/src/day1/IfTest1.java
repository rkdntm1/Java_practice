package day1;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su = 41;
		/*if(su > 20)  //true �϶�
		{
			System.out.println("su�ڷ�: " + su);
			System.out.println("���: 20���� ũ��");
			
		}
		else //false �϶�
		{
			System.out.println("su�ڷ�: " + su);
			System.out.println("���: 20���� �۴�");
		
		}*/
		
		//�������� ����
		if(su >= 90)
			System.out.println("��");
		else if(su >= 80) //else if -> �׷��� �ʴٸ�
			System.out.println("��");
		else if(su >= 70)
			System.out.println("��");
		else if(su >= 60)
			System.out.println("��");
		else
			System.out.println("��");
		

	}

}
