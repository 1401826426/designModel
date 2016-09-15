package mediator;

public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void refuseBuyIBM() {
		System.out.println("不在采购IBM电脑");
	}

	public void buyIBMcomputer(Integer number) {
		super.mediator.execute("purchase.buy",number);
		
	}

}
