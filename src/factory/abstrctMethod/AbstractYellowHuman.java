package factory.abstrctMethod;

public abstract class AbstractYellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("�����˵ķ�ɫ�ǻ�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("������˵��һ����˫�ֽ�");		
	}

	
	

}