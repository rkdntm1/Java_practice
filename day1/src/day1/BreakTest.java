package day1;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1; i<=10; i++)
		{
			if(i%3==0) 
				break;  //  i/3�� �������� 0�̸� break
			System.out.println(i);
		}*/
		
		//�� for���� while������ �����غ���
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			if( i % 3 == 0)
				break;
			
			i++;
		}

	}

}
