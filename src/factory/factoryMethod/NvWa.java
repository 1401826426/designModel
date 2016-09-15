package factory.factoryMethod;

public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new HumanFactory() ;
		System.out.println("================��ɵĵ�һ�����Ǻ���=============");
		Human bHuman = humanFactory.createHuman(BlackHuman.class) ; 
		bHuman.getColor();  
		bHuman.talk(); 
		System.out.println("===============����ĵڶ������ǻ�����================");
		Human yHuman = humanFactory.createHuman(YellowHuman.class) ; 
		yHuman.getColor();  
		yHuman.talk();
	}
}
