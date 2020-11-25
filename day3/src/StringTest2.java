
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] data = {'a', 'b', 'c','d','e','f'}; 
		String a =new String(data, 1, 2);
		*/
		char[] ch = new char[4]; //요롷게 써도됨 1
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		
		char[] ch2 = {'a', 'b', 'c', 'd'}; // 요롷게 써도 됨 2
		
		String a = new String(new char[] {'a','b','c','d'},1,2); // 요롷게 써도 됨 3
		String b= new String(new char[4],1,2); // \0
		
		System.out.println(a.toString());
		System.out.println(a);
		
		//indexOf
		String data = "abcdabc";
		int loc = data.indexOf('c');
		System.out.println(loc);
		

	}

}
