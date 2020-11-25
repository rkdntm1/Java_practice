package com.kita.ex;

import java.io.IOException;

//오류 만들기 Exception을 상속받아야함
class UserException extends Exception
{
	public UserException(String str)
	{
		super(str);
	}
}

class Indust
{
	public void getData() 
	{
		try {
		int data = 0;
			System.out.println("파일 읽어오기");
			System.out.println("데이터 가공하기");
			if(data == 0)
				//오류 던지기
				throw new UserException("read no data");
			System.out.println("데이터 처리하기");				
	}	catch(UserException e) //받기 
		{
			System.out.println(e);
		}
}
}

public class ExceptionTest1 {

	public static void main(String[] args) /*throws IOException*/ {
		// TODO Auto-generated method stub
		/*try {
		Indust ins = new Indust();
		ins.getData();
		}catch(IOException e)
		{
			System.out.println(e);
		}*/
		Indust ins = new Indust();
		ins.getData();
	}
}


