package mediator;

public class Mediator extends AbstractMediator{
	
	
	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equals(str)){
			this.buyComputer((Integer)objects[0]) ; 
		}else if("sale.sell".equals(str)){
			this.sellComputer((Integer)objects[0]) ; 
		}else if("sale.offsell".equals(str)){
			this.offSell() ; 
		}else if("stock.clear".equals(str)){
			this.clearStock() ; 
		}	
	}

	private void clearStock() {
		super.sale.offSale() ;
		super.purchase.refuseBuyIBM();
	}

	private void offSell() {
		System.out.println("折扣销售IBM电脑" + super.stock.getStockNumber() + "台");
	}

	private void sellComputer(Integer number) {
		if(super.stock.getStockNumber() < number){
			super.purchase.buyIBMcomputer(number) ; 
		}
		super.stock.decrease(number) ; 
	}

	private void buyComputer(Integer number) {
		int saleStatus = super.sale.getSaleStatus() ; 
		if(saleStatus > 50){
	    	System.out.println("采购电脑" + number + "台");
	    	super.stock.increase(number) ; 
	    }else{
	    	int buyNumber = number/2 ; 
	    	super.stock.increase(buyNumber) ; 
	    	System.out.println("采购电脑" + buyNumber + "台");
	    }
	}

}













