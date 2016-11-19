package factory.abstrctMethod;

public class NvWa {
	
	public static void main(String[] args) {
		
		HumanFactory maleHumanFactory = new MaleHumanFactory() ; 
		Human maleBlackHuman = maleHumanFactory.createBlackHuman() ; 
		Human maleYellowHuman = maleHumanFactory.createYellowHuman() ; 
		
		maleBlackHuman.getColor();  
		maleBlackHuman.getSex();  
		System.out.println("=======================�ָ���=======================");
		maleYellowHuman.getColor();  
		maleYellowHuman.getSex();  
		System.out.println("=======================�ָ���=======================");		
		HumanFactory femaleHumanFactory = new FemaleFactory() ;
		Human femaleBlackHuman = femaleHumanFactory.createBlackHuman() ; 
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman() ; 
		femaleBlackHuman.getSex();  
		femaleBlackHuman.getColor();  
		System.out.println("=======================�ָ���=======================");		
		femaleYellowHuman.getSex(); 
		femaleYellowHuman.getColor();
		
	}
}
