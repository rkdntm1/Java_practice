package day2;

class Final2 
{
	//public final int su = 10;
	public final String name; 
	public final int su;
	
	public Final2(String name, int su) //생성자
	{
		this.name = name;
		this.su = su; 
	}
	public void prt() //메서드
	{
		System.out.println(name + ", " + su);
	}
}

public class FinalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final2 ins = new Final2("vvv", 10);
		ins.prt();
		
		Final2 ins2 = new Final2("bbb", 20);
		ins.prt();
		/*ins.su = 30;
		System.out.println(ins.su);*/
		

	}

}
