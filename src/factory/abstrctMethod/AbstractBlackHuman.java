package factory.abstrctMethod;

public abstract class AbstractBlackHuman implements Human{
	
	@Override
	public void getColor(){
		System.out.println("���˵ķ�ɫ�Ǻ�ɫ��");
	}
	
	@Override
	public void talk(){
		System.out.println("����˵�Ļ�һ����������");
	}

}