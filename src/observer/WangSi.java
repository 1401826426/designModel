package observer;

public class WangSi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("��˹ �������ӿ�ʼ��ˣ���ҲҪ��ʼ���.......");
		this.cry(context) ; 
		System.out.println("��˹�� ������.........");
	}

	private void cry(String context) {
		System.out.println("��Ϊ" + context + "�����ұ��˰���������������");
	}
	

}
