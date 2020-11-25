package Except;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int su1  = 10;
		int su2 = 0;
		System.out.println(su1/su2);//java.lang.ArithmeticException /by zero
*/
		try {
			System.out.println("11111");
			System.out.println("22222");
			System.out.println(2/0);
			System.out.println("33333");
			System.out.println("55555");
			System.out.println("77777");
		}catch(ArithmeticException e)
		{
			System.out.println("오류");
			System.out.println(e.toString()); //java.lang.ArithmeticException
			System.out.println(e); //java.lang.ArithmeticException
			System.out.println(e.getMessage()); //메세지만 출력 /by zero
			e.printStackTrace(); //at Except.ExceptionTest1.main(ExceptionTest1.java:14)
			
		}
	}

}
