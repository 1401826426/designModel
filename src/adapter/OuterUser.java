package adapter;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("all")
public class OuterUser implements IOuterUser{

	
	@Override
	public Map getUserBaseInfo() {
		HashMap map = new HashMap()  ;
		map.put("username", "���Ա������ĳĳĳ") ; 
		return map;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap map = new HashMap() ; 
		map.put("officeTelNumber", "��˾�绰��7474774")  ;  
		map.put("jobPosition", "������boss") ; 
		return map;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap map = new HashMap() ; 
		map.put("homeAddress", "��ͥ��ַ...........")  ;  
		map.put("homeTelNumber", "8748748748748774") ; 
		return map;
	}

}
