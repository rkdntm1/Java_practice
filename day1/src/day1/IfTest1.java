package day1;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su = 41;
		/*if(su > 20)  //true 일때
		{
			System.out.println("su자료: " + su);
			System.out.println("결과: 20보다 크다");
			
		}
		else //false 일때
		{
			System.out.println("su자료: " + su);
			System.out.println("결과: 20보다 작다");
		
		}*/
		
		//여러가지 조건
		if(su >= 90)
			System.out.println("수");
		else if(su >= 80) //else if -> 그렇지 않다면
			System.out.println("우");
		else if(su >= 70)
			System.out.println("미");
		else if(su >= 60)
			System.out.println("양");
		else
			System.out.println("가");
		

	}

}
