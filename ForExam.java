
public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 1; i <=100; i ++) {
//			if(i % 2 == 0) {
//				continue; //다시 올라감
//			}
			if(i == 50) {
				break;  //반복문이 끝남
			}
			total += i;
		}
		System.out.println(total);

	}

}
