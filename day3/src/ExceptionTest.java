import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("���ڸ� �Է��ϼ���");
			int su1 = Integer.parseInt(sc.nextLine());
			System.out.println("����2�� �Է��ϼ���");
			int su2 = Integer.parseInt(sc.nextLine());
			
			System.out.println(su1/su2);
		
		}
		

	}

}
