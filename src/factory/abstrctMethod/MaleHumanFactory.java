package factory.abstrctMethod;

public class MaleHumanFactory implements HumanFactory{

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman() ; 
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

}
