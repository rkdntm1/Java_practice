
public class Car {
	//타입 필드명
	String name;
	int number;
	
	public Car(String name) {
		this.name = name; // this : 내 구성요소! , 객체 자신을 참조하는 키워드
	}
	
	public Car() {
//		 this.name = "이름 없음";
//		 this.number = 0;
		this("이름없음", 0);//생성자 호출
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}

}
