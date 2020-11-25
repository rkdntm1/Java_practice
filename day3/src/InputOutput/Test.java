package InputOutput;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
//import java.io.PrintStream;

/*
 * byte short int long float double
 * char
 * boolean
 * 
 * wrapper class
 *-> Byte Short Integer Long Folat Doubl
 *      Character 
 */
public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*PrintStream ps = System.out;
		ps.println("eee");
		ps.println("aaa");
		ps.println("rrrr");*/
		
		/*InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);*/
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		/*String data = in.readLine();
		int su = Integer.parseInt(data); */
		
		int data = Integer.parseInt(in.readLine());

	}

}
