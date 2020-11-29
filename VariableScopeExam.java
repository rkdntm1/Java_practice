
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
			//static ���� Ȯ��
			//Ŭ���� ���� : static�� ����, ���� ������ �� �ִ� ������ �ϳ��ۿ�
			//��� ���� �����Ѵ�.
			v1.staticValue = 50;
			v2.staticValue = 100;
			System.out.println(v1.staticValue);
			System.out.println(v2.staticValue);
			System.out.println(VariableScopeExam.staticValue);
	}

}
