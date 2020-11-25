/*
 * 인터페이스
 * 1.interface 인터페이스이름
 * 2. 모든 메서드는 public abstract으로 선언된다.
 * 3. 클래스에서 상속받을떄 implements를 선언한다. 
 * 4. 객체 상속은 할 수 없다.
 */

package com.kita;

public interface Fly {
	//public void prt(); // public abstract(생략) void prt()
	void prt(); //인터페이스에 대한 모든 정보는 public, abstract이 생략
	
}
