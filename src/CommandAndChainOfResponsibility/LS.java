package CommandAndChainOfResponsibility;

public class LS extends AbstractLS{

	@SuppressWarnings("static-access")
	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PRAMA ; 
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls() ; 
	}

}
