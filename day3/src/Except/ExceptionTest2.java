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
			
			System.out.println("��1�� �Է��ϼ���");
			int su1 = Integer.parseInt(in.readLine());
			
			System.out.println("��2�� �Է��ϼ���");
			int su2 = Integer.parseInt(in.readLine());
			System.out.println(su1/su2);
			}
			
			catch(IOException e)
			{
				System.out.println("����� ����");				
			}catch(NumberFormatException e)
			{
				System.out.println("���ڰ� �ԷµǾ����ϴ�."+e);
			}catch(ArithmeticException e)
			{
				System.out.println("0���� ���������ϴ�."+e);
			}catch (Exception e) { //�� �������� ����� �� �տ� ���� �ٸ� ���� ĳġ�� ���� �߻�. 
				System.out.println("�� �ܿ� ��� ����"+e);
			}
			
			
	}
	}
}

