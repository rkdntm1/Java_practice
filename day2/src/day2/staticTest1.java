package day2;

/*
 * static 변수
 * => 클래스 변수, 정적변수 , static 변수
 * => 전역변수
 * => 객체와 무관하게 사용되는 변수
 * => 사용법) 클래스 이름.변수
 * => 메서드 영역에 메모리 지정
 */

class Static1
{
	 public int su1; // 인스턴스 변수
	 public static int su2; // 클래스변수 = 정적변수 = static변수
	 public static final int data = 30;
	 
	 
}


public class staticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 ins1 = new Static1();
		ins1.su1 = 100;
		ins1.su2 = 500;
		
		System.out.println("========");
		Static1 ins2 = new Static1();
		ins2.su1 = 200;
		ins2.su2 = 1000;
		
		
		System.out.println(ins1.su1+ ", "+ins2.su1+",");
		System.out.println(ins1.su2+ ", "+ins2.su2+","+Static1.su2);
		
		System.out.println(Static1.data);
	//	Static.data  = 10;
	}

}
