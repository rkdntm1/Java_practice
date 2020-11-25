import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * 	                 입력				출력
 *  문자         Reader 	       Writer
 * 
 * 바이트     InputStream    OutputStream
 */

public class ExceptionTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요");
		String name = in.readLine();
		
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(in.readLine());
		
		System.out.println("name:" + name);
		System.out.println("age:"+ age);

	}

}
