package day1;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i =1; i<10; i++)
		{
			if(i%3 == 0) // 3 6 9 
				continue; //for문으로 다시 올라감
			
			System.out.print(i+"\t"); // 1 2 4 5 7 8		
		}*/
		
		int i =0;
		while(i<5)
		{
		
			i++;
			if(i==3) 
				continue;
			System.out.println(i);
		}

	}

}
