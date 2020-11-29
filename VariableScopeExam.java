
public class VariableScopeExam {

		int globalScope = 10;
		static int staticValue = 7;
		
		public void scopeTest(int value) {
			int localScope = 20;
			
			System.out.println(globalScope);
			System.out.println(localScope);
			System.out.println(value);
		}
		public void scopeTest2(int value2) {
			System.out.println(globalScope);
			//System.out.println(localScope);
			System.out.println(value2);
			System.out.println(staticValue);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			System.out.println(globalScope);
//			System.out.println(localScope);
//			System.out.println(value);
			System.out.println(staticValue);
			
			VariableScopeExam v1 = new VariableScopeExam();
			System.out.println(v1.globalScope );
			VariableScopeExam v2 = new VariableScopeExam();
			v1.globalScope = 10;
			v2.globalScope = 20;
			System.out.println(v1.globalScope);
			System.out.println(v2.globalScope);
			//static 변수 확인
			//클래스 변수 : static한 변수, 값을 저장할 수 있는 공간이 하나밖에
			//없어서 값을 공유한다.
			v1.staticValue = 50;
			v2.staticValue = 100;
			System.out.println(v1.staticValue);
			System.out.println(v2.staticValue);
			System.out.println(VariableScopeExam.staticValue);
	}

}
