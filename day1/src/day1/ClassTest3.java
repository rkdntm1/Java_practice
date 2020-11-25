package day1;

class Person3
{
	String name; //멤버변수
	
	void doing3(int su, int su2) // 값을 받기위해 변수를 가로안에다 설정! //su, su2 ->매개변수, 지역변수
	{
		System.out.println("<doing3>");
		System.out.println("su: " + su);
		System.out.println("su2: " + su2);
	}
	int add(int a, int b, int c)
	{
		System.out.println("<<add-method>>");
		return a+b+c;
	}
	int[] getJumsu(String name, int age, String gen) //매개변수
	{
		//db연결
		//jumsu검색
		/*int[] jumsu = new int[3]; 
		jumsu[0] = 100;
		jumsu[1] = 60; 
		jumsu[2] = 50;
		return jumsu;*/
		
		System.out.println("name: "+ name + ", age: "+ age+ ", gen: "+ gen);
		
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 90;
		arr[2] = 80;
		return arr;
				
	}
}

public class ClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person3 ins = new Person3(); // ins : 인스턴스 변수, main에서의 관점에서는 지역변수 
		ins.doing3(10,20); //값을 넘겨줌
		int result = ins.add(10, 20, 30);
		System.out.println("result: "+ result);
		
		int[] arr = ins.getJumsu("서울",20,"남");
		System.out.println("======main에서 ======");
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		
		

	}

}
