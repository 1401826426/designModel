package CommandAndChainOfResponsibility;

public abstract class CommandName {
	
	private CommandName  nextOperator ; 
	
	public final String handleMessage(CommandVO vo){
		String result = "" ; 
		if(vo.getParam().size() == 0 || vo.getParam().contains(this.getOperateParam())){
			result = this.echo(vo) ; 
		}else{
			if(this.nextOperator != null){
				result = this.nextOperator.handleMessage(vo) ; 
			}else{
				result = "√¸¡ÓŒﬁ∑®÷¥––" ; 
			}
		}
		return result ; 
		
	}
	
	public void SetNextOperator(CommandName _operator){
		this.nextOperator = _operator ; 
	}

	protected abstract String getOperateParam() ; 
	
	protected abstract String echo(CommandVO vo) ; 
}
