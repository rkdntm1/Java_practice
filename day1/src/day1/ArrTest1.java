package day1;

public class ArrTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기화  initalize
		
		/*int test1;
		System.out.println(test);*/ 
		
		//local variable : 지역변수
		
		/*for(int i=1; i<10; i++) {}
		
		int[] test;
			System.out.println(test);
		*/
		
		int[] arr = new int[3]; //new -> heap 메모리에 할당 '0'으로 초기값 알아서 설정해줌 
					
			for(int i=0; i<=2; i++)
			{
				System.out.println(arr[i]);
			}
			
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			System.out.println("---------------");
			for(int i=0; i<=2; i++)
			{
				System.out.println(arr[i]);
			}
			
		
				

	}

}
