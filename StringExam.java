
public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello"; //����� �������
		String str2 = "hello"; // str1 �� str2 �� ���� �ν��Ͻ��� ������
		
		String str3 = new String("hello"); //���ο� �ν��Ͻ��� �������� �������
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3)); // 3��° �ε�������
		
		System.out.println(str1); //�ѹ� ������� String�� ���� ����������
		
	}

}
