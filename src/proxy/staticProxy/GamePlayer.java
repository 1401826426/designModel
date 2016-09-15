package proxy.staticProxy;

public class GamePlayer implements IGamePlayer{
	
	private String name = "" ; 
	
	public GamePlayer(String name) {
		this.name = name ; 
	}

	@Override
	public void login(String username, String password) {
		System.out.println("那个" + username + "登陆成功");
		
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "在打怪");
		
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "又升了一级");
		
	}
	

	
}
