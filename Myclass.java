
public class Myclass {
	
	//public 리턴타입 메소드명(매개변수 들) { 구현 }
	
	// 여러 메소드 형태들 
	public void method1() {
		System.out.println("m1 이 실행됨...");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 이 실행됨...");
	}
	
	public int method3() {
		System.out.println("m3 이 실행됨...");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y +" m4이 실행됨...");
	}
	
	public int method5(int y) {
		System.out.println(y + " m5 실행됨...");
		return y * 2;
	}
	

	
}
