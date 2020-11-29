
public class StringMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = new String("hello");
		String str = "hello";
		//문자열 길이 구하는 메소드 length
		System.out.println(str.length());
		//문자열과 문자열을 연결해주는 메소드 concat
		System.out.println(str.concat("world"));
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		//문자열 짜르기 n번째부터 
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 4));
		

	}

}
