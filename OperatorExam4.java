
public class OperatorExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 =true;
		boolean b2 =false;
		boolean b3 =true;
		//and or 
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 22;
		if(score <= 100 && score>=70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		//EXOR
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		//not
		System.out.println(!b1);

	}

}
