package day1;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 2;
		short t = 2;
		int b = 10;
		long c = 200L;
		float d = 10.2f;
		double e = 12.2;
		
		char ch='a';
		float test;
		
		System.out.println(a);
		System.out.println(ch);
		
		//byte -> short => int -> long -> float -> double
		//        char -> int 
		
		test = b; // 10.0f
		
		System.out.println(test);
		
		float data = 10.2f; 
		
		//////////////////////////////////////
		
		//명시적 형변환
		int data1 = 65;// 65 = A
		
		char data2;
		
		data2 = (char)data1; // int -> char 타입으로 바꿀거야
		
		System.out.println("data2:" + data2);
		
		double data3 = 10.2;
		int data4 = (int)data3; //dobule - > int 타입으로 변경 
		
		System.out.println("data3: " + data4);
		
	
		
		
		
		

	}

}
