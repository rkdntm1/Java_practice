import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0; 		
		Scanner scan = new Scanner(System.in);
		//System.in :Ű����� ���� �Է¹���
		
		do {
			//�ݺ��� �����
			value = scan.nextInt(); //�������� �Է¹޾�  value�� �־���
			System.out.println("�Է¹��� ��: "+ value);
			
		}while(value != 10 );
		
		System.out.println("�ݺ��� ����!");

	}

}
