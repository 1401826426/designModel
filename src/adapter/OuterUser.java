package adapter;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("all")
public class OuterUser implements IOuterUser{

	
	@Override
	public Map getUserBaseInfo() {
		HashMap map = new HashMap()  ;
		map.put("username", "这个员工叫做某某某") ; 
		return map;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap map = new HashMap() ; 
		map.put("officeTelNumber", "公司电话是7474774")  ;  
		map.put("jobPosition", "俺们是boss") ; 
		return map;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap map = new HashMap() ; 
		map.put("homeAddress", "家庭地址...........")  ;  
		map.put("homeTelNumber", "8748748748748774") ; 
		return map;
	}

}
