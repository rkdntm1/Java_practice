package day1;

public class ArrTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		
		
		System.out.println(arr.length); 
		
		for(int i=0; i<=arr.length; i++) // 0 1 2 3 4 5
			System.out.println(arr[i]);
		//java.lang.ArrayIndexOutOfBoundsException
		/*
		 * i=6 �϶�  arr[6]�ε� arr[]�� arr[0]~arr[5] �ۿ� �ȳ��� �ֱ⿡ ���� �߻�
		 *  syntax error ������ ������ ������ �����°�
		 * runtime error ������ �ϴ� �������� ���� -> Exception
		 */

	}

}
