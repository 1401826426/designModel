package adapter;

import java.util.Map;

@SuppressWarnings("all")
public class OuterUserInfo extends OuterUser implements IUserInfo{

	private Map<String  , String> baseMap = super.getUserBaseInfo() ; 
	
	private Map<String  , String> homeMap = super.getUserHomeInfo() ; 
	
	private Map<String  , String> officeMap = super.getUserOfficeInfo() ; 
	
	
	
	
	@Override
	public String getUsername() {
		return baseMap.get("username");
	}

	@Override
	public String getHomeAddress() {
		return homeMap.get("homeAddress");
	}

	@Override
	public String getOfficeTelNumber() {
		return officeMap.get("officeTelNumber");
	}

	@Override
	public String getJobPosition() {
		return officeMap.get("jobPosition");
	}

	@Override
	public String getHomeTelNumber() {
		return  homeMap.get("homeTelNumber");
	}

}
