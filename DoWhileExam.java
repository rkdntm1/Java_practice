import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0; 		
		Scanner scan = new Scanner(System.in);
		//System.in :키보드로 값을 입력받음
		
		do {
			//반복할 문장들
			value = scan.nextInt(); //정수값을 입력받아  value에 넣어줌
			System.out.println("입력받은 값: "+ value);
			
		}while(value != 10 );
		
		System.out.println("반복문 종료!");

	}

}
