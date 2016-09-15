package factory.abstrctMethod;

public class NvWa {
	
	public static void main(String[] args) {
		
		HumanFactory maleHumanFactory = new MaleHumanFactory() ; 
		Human maleBlackHuman = maleHumanFactory.createBlackHuman() ; 
		Human maleYellowHuman = maleHumanFactory.createYellowHuman() ; 
		
		maleBlackHuman.getColor();  
		maleBlackHuman.getSex();  
		System.out.println("=======================���ǿ��ֵķָ���=======================");
		maleYellowHuman.getColor();  
		maleYellowHuman.getSex();  
		System.out.println("=======================���ǿ��ֵķָ���=======================");		
		HumanFactory femaleHumanFactory = new FemaleFactory() ;
		Human femaleBlackHuman = femaleHumanFactory.createBlackHuman() ; 
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman() ; 
		femaleBlackHuman.getSex();  
		femaleBlackHuman.talk(); 
		System.out.println("=======================���ǿ��ֵķָ���=======================");		
		femaleYellowHuman.getSex(); 
		femaleYellowHuman.talk()  ; 
		
	}
}
