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
		System.out.println("IBM���Ե��������Ϊ" + status);
	    return status;
	}
	
	public void sellIBMComputer(int number){
		super.mediator.execute("sale.sell", number);
		System.out.println("������Ա���۵���" + number + "̨");
	}

}
