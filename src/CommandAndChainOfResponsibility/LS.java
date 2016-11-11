package CommandAndChainOfResponsibility;

public class LS extends AbstractLS{

	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PRAMA ; 
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls() ; 
	}

}
