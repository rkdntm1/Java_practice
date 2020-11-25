package day1;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1; i<=10; i++)
		{
			if(i%3==0) 
				break;  //  i/3의 나머지가 0이면 break
			System.out.println(i);
		}*/
		
		//위 for문을 while문으로 변경해보기
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
