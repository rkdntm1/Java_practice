
public class Car {
	//Ÿ�� �ʵ��
	String name;
	int number;
	
	public Car(String name) {
		this.name = name; // this : �� �������! , ��ü �ڽ��� �����ϴ� Ű����
	}
	
	public Car() {
//		 this.name = "�̸� ����";
//		 this.number = 0;
		this("�̸�����", 0);//������ ȣ��
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}

}
