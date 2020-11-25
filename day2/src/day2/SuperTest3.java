package day2;

class A
{
	public A(String name)
	{
		
	}	
}
class B extends A
{

	public B(String name) {
		super(name); //부모클래스에 default 생성자가 없으므로 초기값을 부모클래스의 생성자에 설정값을 자식클래스에서ㅇ
		// TODO Auto-generated constructor stub
	}
	
}


public class SuperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ins = new B("eee");

	}

}
