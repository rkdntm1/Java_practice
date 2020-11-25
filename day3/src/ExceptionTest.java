import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("숫자를 입력하세요");
			int su1 = Integer.parseInt(sc.nextLine());
			System.out.println("숫자2를 입력하세요");
			int su2 = Integer.parseInt(sc.nextLine());
			
			System.out.println(su1/su2);
		
		}
		

	}

}
