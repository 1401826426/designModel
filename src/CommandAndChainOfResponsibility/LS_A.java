package CommandAndChainOfResponsibility;

public class LS_A extends AbstractLS{

	@SuppressWarnings("static-access")
	@Override
	protected String getOperateParam() {
		return super.A_PARAM;
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls_a();
	}

}
