package day1;

public class OpTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 == 10); //true
		System.out.println(10 != 10); //not equals (<>)//false		
		System.out.println(20>20); //false
		System.out.println(10<=20); // true
		
		System.out.println("==========");
		System.out.println(10>20 && 10<20); // && -> and(두개다 맞아야함 ) // F and T -> F 
		System.out.println(10>20 || 10<20); // || -> or(둘중 하나만 맞아도 ) // F or T -> T
		System.out.println(!(10>20)); //not(false) = > true 
		
		// &&  &
		
		System.out.println("축약역산");
		System.out.println(false && true);
		System.out.println(false & true);
		
		System.out.println(true|| false);
		System.out.println(true | false);
	}

}
