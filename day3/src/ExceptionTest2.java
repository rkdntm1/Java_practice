import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * 	                 �Է�				���
 *  ����         Reader 	       Writer
 * 
 * ����Ʈ     InputStream    OutputStream
 */

public class ExceptionTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�̸��� �Է��ϼ���");
		String name = in.readLine();
		
		System.out.println("���̸� �Է��ϼ���");
		int age = Integer.parseInt(in.readLine());
		
		System.out.println("name:" + name);
		System.out.println("age:"+ age);

	}

}
