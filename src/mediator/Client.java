package mediator;

public class Client {
	public static void main(String[] args) {
		AbstractMediator  mediator = new Mediator() ;
		System.out.println("======�ɹ���Ա�ɹ�����==========");
		Purchase purchase = new Purchase(mediator) ; 
		purchase.buyIBMcomputer(100);
		System.out.println("============������Ա���۵���===============");
        Sale sale = new Sale(mediator) ; 
        sale.sellIBMComputer(50);
        System.out.println("==========�ⷿ������Ա�������=================");
        Stock stock = new Stock(mediator) ; 
        stock.clearStock();
	}
}