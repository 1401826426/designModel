package CommandAndChainOfResponsibility;

public class LS_L extends AbstractLS{

	@SuppressWarnings("static-access")
	@Override
	protected String getOperateParam() {
		return super.L_PARAM ; 
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls_l() ; 
	}

}
