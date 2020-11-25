package day1;
/*
 * private : 클래스내에서만 접근
 * default  
 * protected
 * public : 전체 공개
*/
class Student
{
	private String name;
	private int age = 20; //인스턴스 변수 or 멤버변수
	// setter: 바꾸는   getter: 얻어노는
	
	public void setAge(int age) //매개변수
	{
		this.age +=age; // age = age + age 
		//System.out.println(this.age);
		//age: 매개변수 age를 의미 this.age -> 인스턴스 변수 age 의미
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
