package Except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.modelmbean.XMLParseException;


//2 �̻��� ���ڸ� �Է��ؼ� ����ϼ���
/*
 *  �Է� ���� : 2 
 *  -> 2 �Դϴ�.
 *  �Է¼��� : 7
 *  -> 7 �Դϴ�.
 *  
 *  �Է¼��� : 1
 *  -> Exception �� �߻��ϵ���
 * 
 */
public class ExceptionTest3 {

	public static void main(String[] args) /*throws XMLParseException*/ { //�̷��
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {		
			System.out.println("���ڸ� �Է��ϼ���: ");
			int su = Integer.parseInt(in.readLine());
			
			if(su <2)
				throw new XMLParseException();

		}catch(IOException e)
		{
			System.out.println(e.toString());
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}catch(XMLParseException e) // �ȹ̷��
		{
			System.out.println("���ڸ� 2�̻� �Է��ؾ� ��");
		}

}
}