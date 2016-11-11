package CommandAndChainOfResponsibility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommandVO {

	public final static String 	DIVIDE_FLAG = " " ; 
	
	public final static String PERFIX = "-" ; 
	
	private String commandName = "" ; 
	
	private List<String> paramList = new ArrayList<String>() ;
	
	private List<String> dataList = new ArrayList<String>() ; 
	
	public CommandVO(String commandStr){
		
		if(commandStr != null && commandStr.length() != 0){
			
			String[] complexStr = commandStr.split(CommandVO.DIVIDE_FLAG) ; 
			
			this.commandName = complexStr[0] ; 
			
			for(int i = 1;i < complexStr.length ;i++){
				String str = complexStr[0] ; 
				if(str.indexOf(CommandVO.PERFIX) == 0){
					this.paramList.add(str.replace(CommandVO.PERFIX, "").trim()) ; 
				}else{
					this.dataList.add(str.trim()) ; 
				}
			}
		}else{
			System.out.println("ÃüÁî³ö´í");
		}
	}
	
	
	public String getCommandName(){
		return this.commandName ; 
	}
	
	public List<String> getParam(){
		if(this.paramList.size() == 0){
			this.paramList.add("") ; 
		}
		return new ArrayList<String>(new HashSet<String>(this.paramList)); 
	}
	
	public List<String> getData(){
		return this.getData() ; 
	}
	
	
	
	
 
}
























