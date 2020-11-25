public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String 
		String name = "hong";
		String name2 = "hong";
		String name3 = new String("hong");
		String name4 = new String("hong");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println("==================");
		
		System.out.println(name == name3);
		System.out.println(name.equals(name3));
		
		System.out.println("==================");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

	}

}
