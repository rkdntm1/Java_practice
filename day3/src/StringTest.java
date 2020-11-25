
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 =new String();

		char[] str = {'a', 'b', 'c'};
		String s2 =new String(str);
		//=String s2 =new String(['a', 'b', 'c']);

		String data = "abc";
		String s3 = new String(data);
		//= String s3 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		char result1 = s3.charAt(1);
		System.out.println(result1);
		System.out.println("======");
		
		//API// static String	valueOf(int i) // int 를 String 타입으로
		int su1 =10;
		String result2 = String.valueOf(su1);
		System.out.println(result2);
		System.out.println(result2+30);
				


	}

}
