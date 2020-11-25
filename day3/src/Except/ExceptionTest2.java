package Except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true)
		{			
			BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
			
			try {
			
			System.out.println("수1를 입력하세요");
			int su1 = Integer.parseInt(in.readLine());
			
			System.out.println("수2를 입력하세요");
			int su2 = Integer.parseInt(in.readLine());
			System.out.println(su1/su2);
			}
			
			catch(IOException e)
			{
				System.out.println("입출력 오류");				
			}catch(NumberFormatException e)
			{
				System.out.println("문자가 입력되었습니다."+e);
			}catch(ArithmeticException e)
			{
				System.out.println("0으로 나누었습니다."+e);
			}catch (Exception e) { //맨 마지막에 써야지 맨 앞에 스면 다른 오류 캐치들 오류 발생. 
				System.out.println("그 외에 모든 오류"+e);
			}
			
			
	}
	}
}

