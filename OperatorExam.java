
public class OperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		//증감 연산자
		int i4 = ++i3; // i3 =i3+1;
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++; // i3 = i3+1;
		System.out.println(i5);
		System.out.println(i3);
		
		//산술 연산자
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double)j);//정수끼리 연산 -> 정수로 리턴
		System.out.println(i % j);

	}

}
