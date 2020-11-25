package day1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 3 5 7 9
		System.out.println("=========for¹®=========");
		for(int i=0; i<10; i++)
		{
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		System.out.println("========while¹®=========");
		int i = 0;
		while(i<10)
		{
			i++;
			if(i % 2 ==0)
				continue;
			else
			System.out.println(i);
			
		}

	} // main 

} // class
