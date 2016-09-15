package mediator;

public class Stock extends AbstractColleague{

	
	private static int CURRENT_NUMBER = 100 ; 

	public Stock(AbstractMediator abstractMediator) {
		super(abstractMediator) ;  
	}

	public int getStockNumber() {
		return CURRENT_NUMBER ; 
	}

	public void increase(int number) {
		CURRENT_NUMBER = CURRENT_NUMBER + number ; 
	}

	public void decrease(Integer number) {
		CURRENT_NUMBER = CURRENT_NUMBER - number ; 
	}
	
	public void clearStock(){
		System.out.println("清理库存数量为:" + CURRENT_NUMBER);
		mediator.execute("stock.clear");
	}

}












