package builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
	
	
	private List<String> sequence = new ArrayList<String>() ; 
	
	private BenzBuilder benzBuilder = new BenzBuilder() ; 
	
	private BMWBuilder bmwBuilder = new BMWBuilder() ; 
	
	public BenzModel getABenzModel(){
		this.sequence.clear();  
		this.sequence.add("start") ; 
		this.sequence.add("stop") ; 
		this.benzBuilder.setSequence(this.sequence) ; 
		return (BenzModel)this.benzBuilder.getCarModle() ; 	
	}
	
	public BenzModel getBBenzModel(){
		this.sequence.clear();  
		this.sequence.add("engine boom") ; 
		this.sequence.add("start") ; 
		this.sequence.add("stop") ; 
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModle() ; 
	}
	
	
	public BMWModel getCBWModel(){
		this.sequence.clear();  
		this.sequence.add("alarm") ; 
		this.sequence.add("start") ; 
		this.sequence.add("stop") ; 
		this.bmwBuilder.setSequence(this.sequence) ; 
		return (BMWModel)this.bmwBuilder.getCarModle() ; 
	}
	
	public BMWModel getDBMWModel(){
		this.sequence.clear();  
		this.sequence.add("start") ; 
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel)this.bmwBuilder.getCarModle() ; 
	}
	
}






















