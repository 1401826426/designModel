package mediator;

public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void refuseBuyIBM() {
		System.out.println("���ڲɹ�IBM����");
	}

	public void buyIBMcomputer(Integer number) {
		super.mediator.execute("purchase.buy",number);
		
	}

}
