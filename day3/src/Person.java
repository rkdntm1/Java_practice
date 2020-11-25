class Man
{
	private int age= 10;
	private String name = "hong";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+ name + ", age: " + age;
	}
	
}


public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man ins = new Man();
		Man ins2 = new Man();
		/*
		String result1 = ins.toString();
		String result2 = ins.toString();
		
		
		System.out.println(result1);
		System.out.println(result2);
        */
		
		System.out.println(ins.toString());
		System.out.println(ins2.toString());
		System.out.println("---------------");
		System.out.println(ins);
		System.out.println(ins2);
	

	}

}
