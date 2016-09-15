package builder;

import java.util.List;

public class BenzBuilder extends CarBuilder{

	private BenzModel benzModel = new BenzModel() ; 
	
	public void setSequence(List<String> sequence) {
		this.benzModel.setSequence(sequence) ; 
	}

	@Override
	public CarModel getCarModle() {
		return this.benzModel; 
	}

}
