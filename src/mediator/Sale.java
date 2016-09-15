package mediator;

import java.util.Random;

public class Sale extends AbstractColleague{

	public Sale(AbstractMediator abstractMediator) {
		super(abstractMediator) ; 
	}

	public void offSale() {
		super.mediator.execute("sale.offsell") ; 
	}

	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis()) ; 
	    int status = rand.nextInt(100) ; 
		System.out.println("IBM电脑的销售情况为" + status);
	    return status;
	}
	
	public void sellIBMComputer(int number){
		super.mediator.execute("sale.sell", number);
		System.out.println("销售人员销售电脑" + number + "台");
	}

}
