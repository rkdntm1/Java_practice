
public class StringMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = new String("hello");
		String str = "hello";
		//���ڿ� ���� ���ϴ� �޼ҵ� length
		System.out.println(str.length());
		//���ڿ��� ���ڿ��� �������ִ� �޼ҵ� concat
		System.out.println(str.concat("world"));
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		//���ڿ� ¥���� n��°���� 
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 4));
		

	}

}
