package factory.factoryMethod;

public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new HumanFactory() ;
		System.out.println("================造成的第一批人是黑人=============");
		Human bHuman = humanFactory.createHuman(BlackHuman.class) ; 
		bHuman.getColor();  
		bHuman.talk(); 
		System.out.println("===============造出的第二批人是黄种人================");
		Human yHuman = humanFactory.createHuman(YellowHuman.class) ; 
		yHuman.getColor();  
		yHuman.talk();
	}
}
