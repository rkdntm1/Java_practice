
public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello"; //상수에 만들어짐
		String str2 = "hello"; // str1 과 str2 는 같은 인스턴스를 참조함
		
		String str3 = new String("hello"); //새로운 인스턴스가 힙영역에 만들어짐
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		if(str1 == str3)
			System.out.println("str1과 str3는 같은 레퍼런스입니다.");
		if(str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다.");
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3)); // 3번째 인덱스부터
		
		System.out.println(str1); //한번 만들어진 String의 값이 변하지않음
		
	}

}
