package day1;

public class OpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		char data = 'a'; //�����϶��� ��������ǥ��
		
		String ch1 = "abc"; //���ڿ��϶��� ū����ǥ //String -> Ŭ����Ÿ��
		String ch2 = "hello";
				
		System.out.println(a + b); // 10 + 20 = 30 
		System.out.println(ch1 + ch2); // abc + hello = abchello //���ڿ� �յ� ����
		
		
		System.out.println(10+"bbb"); //���� ����
		System.out.println("aaa"+"bbb"); // ���� ����
		System.out.println("test" + 10 + 20); // ���� ���� ���� // �տ��� ���ڸ� �� ����
		System.out.println(10+20+"test"); //���� ���� ���� // �տ��� ���ڸ� ��� �� ����
		
		System.out.println(10/3); // ���� ��
		System.out.println(10/3.0);
			//defalt: int 
			//int+float=>float int+double->double
			//char + char => int
		System.out.println(10%3); // ���� ������
		
	}

}
