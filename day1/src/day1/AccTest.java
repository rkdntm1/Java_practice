package day1;
/*
 * private : Ŭ������������ ����
 * default  
 * protected
 * public : ��ü ����
*/
class Student
{
	private String name;
	private int age = 20; //�ν��Ͻ� ���� or �������
	// setter: �ٲٴ�   getter: �����
	
	public void setAge(int age) //�Ű�����
	{
		this.age +=age; // age = age + age 
		//System.out.println(this.age);
		//age: �Ű����� age�� �ǹ� this.age -> �ν��Ͻ� ���� age �ǹ�
	}
	public int getAge()
	{
		return age;
	}
	/*public void setName(int name)
	{
		name = name; 		
	}
	 public String getName()
	 {
		 return name;
	 }*/
	 
}


public class AccTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		/*System.out.println(s.name);
		System.out.println(s.age);
*/
		/*s.setName("hong");
		String result = s.getName();
		System.out.println(result);
*/
		s.setAge(2);
		int x = s.getAge();
		System.out.println(x);
		
		}

}
