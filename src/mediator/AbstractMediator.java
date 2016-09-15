package mediator;

public abstract class AbstractMediator {

	protected Purchase purchase ; 
	protected Stock stock ; 
	protected Sale sale ; 
	
	public abstract void execute(String str , Object...objects);
	
	
	public AbstractMediator(){
		this.purchase = new Purchase(this) ; 
		this.sale = new Sale(this) ; 
		this.stock = new Stock(this) ; 
	}
	
	
	
}