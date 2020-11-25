package day2;


class Ref1
{
	public int su=20;	
}


public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 ins =new Ref1();
		Ref1 ins2 = new Ref1();
		
		ins.su= 100;
		ins2.su =200;
		
		System.out.println(ins);
		System.out.println(ins2);
		System.out.println(ins.su + ", " + ins2.su);
		System.out.println("==============");
		
		ins = ins2; // ins2 -> ins °ª º¹»ç
		System.out.println(ins);
		System.out.println(ins2);
		System.out.println(ins.su + ", " + ins2.su);
				
	}

}
