package com.kita.ex;

import java.io.IOException;

//���� ����� Exception�� ��ӹ޾ƾ���
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
			System.out.println("���� �о����");
			System.out.println("������ �����ϱ�");
			if(data == 0)
				//���� ������
				throw new UserException("read no data");
			System.out.println("������ ó���ϱ�");				
	}	catch(UserException e) //�ޱ� 
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


