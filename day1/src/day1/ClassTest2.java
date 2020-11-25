package day1;

class Person2
{
	String studentno; //멤버변수
	
	String doing1()
	{
		String name = "hong gil dong"; // 지역변수(local variable)
		System.out.println("<doing1>");
		return name;
	}
	int[] doing2()
	{
		int[] arr = {10, 20 , 30};
		System.out.println("<doing2>");
		return arr;
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main에서 doing1메서드와 doing2메서드 호출해서 값 출력
		Person2 obj1 = new Person2();
		
		String irum = obj1.doing1();
		System.out.println(irum);
		System.out.println("----------");
		
		int[] result = obj1.doing2();		
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
		

	}

}
