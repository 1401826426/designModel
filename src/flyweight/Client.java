package flyweight;

public class Client {
	
	public static void main(String[] args) {
		for(int i = 0;i < 4;i++){
			String subject = "��Ŀ" + i ; 
			for(int j = 0;j < 30;j++){
				String key = subject + "���Եص�" + j ; 
				SignInfoFactory.getSignInfo(key) ; 
			}
		}
		for(int i = 0;i < 4;i++){
			String subject = "��Ŀ" + i ; 
			for(int j = 0;j < 30;j++){
				String key = subject + "���Եص�" + j ; 
				SignInfoFactory.getSignInfo(key) ; 
			}
		}
		
	}
}


























