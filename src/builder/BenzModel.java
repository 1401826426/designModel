package builder;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("����������������");
	}

	@Override
	protected void stop() {
		System.out.println("����Ӧ������ͣ��");	
	}

	@Override
	protected void alarm() {
		System.out.println("���۵�����������������");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���۵�����������������");
	}

	

}
