package com.kita;

public class FlymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fly ins = new Fly(); //인터페이스로 객체 못만듦
		FlyImple ins = new FlyImple();
		ins.prt();
		Fly ins2 = new FlyImple();
		ins.prt();
		//FlyImple ins = new Fly(); //인터페이스로 객체 못만듬
		
		

	}

}
