package proxy.staticProxy;

public class GamePlayer implements IGamePlayer{
	
	private String name = "" ; 
	
	public GamePlayer(String name) {
		this.name = name ; 
	}

	@Override
	public void login(String username, String password) {
		System.out.println("�Ǹ�" + username + "��½�ɹ�");
		
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "�ڴ��");
		
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "������һ��");
		
	}
	

	
}
