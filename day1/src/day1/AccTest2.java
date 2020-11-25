package day1;



/* 접근 제한자
 * private : 클래스내에서
 * 
 * public : 전체공개
 * =============================================================
 * => 생성자 Constructor : 객체를 만들때 인스턴스 변수를 초기화 하기 위한 목적
 *    생성자 : 객체가 만들어지면서 자동으로 호출
 *         : 리턴 타입 언급이 없어야함
 *         
 *         클래스 이름()
 *         {  
 *         
 *         }
 * 	        default 생성자(기본생성자)
 * 			:개발자가 만든 생성자가 아님
 * 			=>생성자가 없을때 class 파일 생성시 자동으로 추가된 생성자
 * 			public class 클래스()
			{
	
			}
	 
 */

class Man
{
	private String name;
	private int age;
	
	// 생성자 오버로딩
	/*
	 * 클래스내에서 이름이 같은 생성자를 여러개 정의 할 수 있다.
	 * ->매개변수의 타입, 순서, 갯수 가 다를때 -> 다른 생성자로 인식
	 */
	public Man(String name)
	{
		
	}
	public Man(int age)
	{
		
	}
	public Man(int age, String name)
	{
		
	}
	public Man(String name, int age)  
	{
		this.name=name;
		this.age =age;
	}
	public Man()
	{
		
	}
	
	public void prt()
	{
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
	}
	
	
	/*public Man() //생성자 -> 리턴타입을 쓰지 않음
	{
		System.out.println("Man 생성자 호출");
	}*/	
	
	//setter getter 필요함 -> 메서드
	
}

public class AccTest2 {
	public static void main(String[] args) {
		Man ins = new Man("hong",20);
		ins.prt();
		//Man ins = new Man(); //개발자가 생성자를 이미 만들어서 default 생성자가 없어서 오류 발생.
		
	}

}
