package com.kita;

//접근 제한자: private < default < protected < public
/*
 * 오버라이딩 : 재정의
 * 상속관계에서 부모에서 정의한 메서드 자식에서 다시 정의
 * 메서드이름이 같고, 매개변수, 순서, 갯수가 같아야, 리턴타입도 같아야함
 * 오버라이딩시 접근지정자는 범위가 같거나 넓어야
 */

class Sample
{
	void prt() //default
	{
		System.out.println("prt");
	}
}

class Sample1 extends Sample
{
	@Override
	public void prt()
	{ 
		System.out.println("prt");
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
