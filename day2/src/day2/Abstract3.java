package day2;


abstract class T1
{
	public void test1()
	{
		System.out.println("T1 test1");
	}
	public abstract void test2();
	public void test3()
	{
		System.out.println("t1-test3");
	}
	
}
  class T2 extends T1
  {
	  @Override
	  public void test1() {
		  System.out.println("t2- test1");
	  }

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("t2- test2");
	}
	public void test4()
	{
		System.out.println("t2- test4");
	}
	
  }
  


public class Abstract3 {
   public static void main(String[] args) {
	 //T1 ins=new T1(); 추상클래스에서 객체 생성안됨
	   
//	   T2 ins2=new T2();
//	   ins2.test1(); // t2 test1
//	   ins2.test2(); // t2 test2
//	   ins2.test3(); // t1 test3
//	   ins2.test4(); // t2 test4
//	   
	   T1 ins3 = new T2();
	   ins3.test1();
	   ins3.test2();
	   ins3.test3();
	   
	   //T2 ins4 =(T2)new T1();
	   
	   
	   
	 
	 
	 
}
}
