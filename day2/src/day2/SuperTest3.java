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
		super(name); //�θ�Ŭ������ default �����ڰ� �����Ƿ� �ʱⰪ�� �θ�Ŭ������ �����ڿ� �������� �ڽ�Ŭ����������
		// TODO Auto-generated constructor stub
	}
	
}


public class SuperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ins = new B("eee");

	}

}
