package com.kita;

//���� ������: private < default < protected < public
/*
 * �������̵� : ������
 * ��Ӱ��迡�� �θ𿡼� ������ �޼��� �ڽĿ��� �ٽ� ����
 * �޼����̸��� ����, �Ű�����, ����, ������ ���ƾ�, ����Ÿ�Ե� ���ƾ���
 * �������̵��� ���������ڴ� ������ ���ų� �о��
 */

class Sample
{
	void prt() //default
	{
		System.out.println("prt");
	}
}

class Sample1 extends Sample
{
	@Override
	public void prt()
	{ 
		System.out.println("prt");
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
