package day2;
/*
 * static 초기화 블록
 * static{
 * 
 * }
 * 클래스 로딩시에 1번 호출
 * 
 */


class Static2
{
	public final static int[] su;
	//초기화 블럭
	static {
		System.out.println("static 초기화 블록");
		su = new int[4];
		for(int i=0; i<su.length; i++)
			su[i] = i*10;
		
	}
	{
		System.out.println("블록");				
	}
	public Static2()
	{
		System.out.println("객체 생성 - 생성자");
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static2 ins = new Static2();
		System.out.println("=====");
		Static2 ins2 = new Static2();
		
		int[] result = Static2.su;
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);

	}

}
