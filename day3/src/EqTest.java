/*
 * @author 牧家-3-08
 *
 */
class A
{
	private String name;
	private int age;
	public int jumsu = 100;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + jumsu;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (age != other.age)
			return false;
		if (jumsu != other.jumsu)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class EqTest {
	//equals : 按眉客 按眉甫 厚背 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	A ins = new A("aaa", 10);
		A ins2 = new A("aaa", 10);
		
		System.out.println(ins.equals(ins2));
		System.out.println(ins.jumsu == ins2.jumsu);
		*/
		
		A ins = new A("aa", 10);
		Object a = new A("bb", 10);
		
		boolean result1 = ins.equals(a);
		boolean result2 = ins.equals(new A("bb",10));
			System.out.println(result1);
		System.out.println(result2);
			
	}

}
