package builder;

public class Client {
	public static void main(String[] args) { 
		Director director = new Director() ; 
		for(int i = 0;i < 1;i++){
			director.getABenzModel().run(); 
			System.out.println("-------------------的分割线-------------");
		}
		for(int i = 0;i < 2;i++){
			director.getBBenzModel().run();
			System.out.println("-------------------分割线-------------");
		}
		for(int i = 0;i < 3;i++){
			director.getCBWModel().run(); 
			System.out.println("-------------------分割线-------------");
		}
		for(int i = 0;i < 4;i++){
			director.getDBMWModel().run() ; 
			System.out.println("-------------------分割线-------------");
		}
		
	}
}
