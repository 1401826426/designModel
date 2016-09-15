package factory.abstrctMethod;

public class NvWa {
	
	public static void main(String[] args) {
		
		HumanFactory maleHumanFactory = new MaleHumanFactory() ; 
		Human maleBlackHuman = maleHumanFactory.createBlackHuman() ; 
		Human maleYellowHuman = maleHumanFactory.createYellowHuman() ; 
		
		maleBlackHuman.getColor();  
		maleBlackHuman.getSex();  
		System.out.println("=======================我是快乐的分割线=======================");
		maleYellowHuman.getColor();  
		maleYellowHuman.getSex();  
		System.out.println("=======================我是快乐的分割线=======================");		
		HumanFactory femaleHumanFactory = new FemaleFactory() ;
		Human femaleBlackHuman = femaleHumanFactory.createBlackHuman() ; 
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman() ; 
		femaleBlackHuman.getSex();  
		femaleBlackHuman.talk(); 
		System.out.println("=======================我是快乐的分割线=======================");		
		femaleYellowHuman.getSex(); 
		femaleYellowHuman.talk()  ; 
		
	}
}
