package Except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.modelmbean.XMLParseException;


//2 이상의 숫자를 입력해서 출력하세요
/*
 *  입력 숫자 : 2 
 *  -> 2 입니다.
 *  입력숫자 : 7
 *  -> 7 입니다.
 *  
 *  입력숫자 : 1
 *  -> Exception 이 발생하도록
 * 
 */
public class ExceptionTest3 {

	public static void main(String[] args) /*throws XMLParseException*/ { //미루기
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {		
			System.out.println("숫자를 입력하세요: ");
			int su = Integer.parseInt(in.readLine());
			
			if(su <2)
				throw new XMLParseException();

		}catch(IOException e)
		{
			System.out.println(e.toString());
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(XMLParseException e) // 안미루기
		{
			System.out.println("숫자를 2이상 입력해야 함");
		}

}
}