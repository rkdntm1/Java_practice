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
		 * i=6 일때  arr[6]인데 arr[]은 arr[0]~arr[5] 밖에 안나와 있기에 오류 발생
		 *  syntax error 실행을 했을대 빨갛게 나오는것
		 * runtime error 실행을 하는 과정에서 문제 -> Exception
		 */

	}

}
