package observer;

public class LiSi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�����ӵĻ����ʼ���ϰ�㱨��");
		this.reportToQinShiHuang(context) ; 
		System.out.println("��˹ �㱨��ϡ�����������");
	}

	private void reportToQinShiHuang(String context) {
		System.out.println("��˹:���� , ���ϰ� ��  �������л��---->"  + context);
	}
	
}
