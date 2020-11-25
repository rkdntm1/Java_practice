package day1;

public class OpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		char data = 'a'; //문자일때는 작은따옴표ㅗ
		
		String ch1 = "abc"; //문자열일때는 큰따옴표 //String -> 클래스타입
		String ch2 = "hello";
				
		System.out.println(a + b); // 10 + 20 = 30 
		System.out.println(ch1 + ch2); // abc + hello = abchello //문자열 합도 가능
		
		
		System.out.println(10+"bbb"); //숫자 문자
		System.out.println("aaa"+"bbb"); // 문자 문자
		System.out.println("test" + 10 + 20); // 문자 숫자 숫자 // 앞에가 문자면 다 연결
		System.out.println(10+20+"test"); //숫자 숫자 문자 // 앞에가 숫자면 계산 후 연결
		
		System.out.println(10/3); // 나눈 몫
		System.out.println(10/3.0);
			//defalt: int 
			//int+float=>float int+double->double
			//char + char => int
		System.out.println(10%3); // 나눈 나머지
		
	}

}
