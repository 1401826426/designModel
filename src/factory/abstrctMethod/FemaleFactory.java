package factory.abstrctMethod;

public class FemaleFactory implements HumanFactory{

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman() ; 
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman() ; 
	}
	
}
