package adapter;

public class Client {
	
	public static void main(String[] args) {
		
		IUserInfo inUser = new UserInfo() ; 
		inUser.getUsername() ; 
		inUser.getHomeAddress() ; 
		inUser.getHomeTelNumber() ; 
		inUser.getJobPosition() ; 
		inUser.getOfficeTelNumber() ; 
		System.out.println("====================·Ö¸îÏß==============");
		IUserInfo outUser = new OuterUserInfo() ; 
		System.out.println(outUser.getUsername()); 
		System.out.println(outUser.getHomeAddress());
		System.out.println(outUser.getHomeTelNumber());
		System.out.println(outUser.getJobPosition());
		System.out.println(outUser.getOfficeTelNumber());
	}
}
