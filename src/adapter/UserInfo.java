package adapter;

public class UserInfo implements IUserInfo{

	@Override
	public String getUsername() {
		System.out.println("��ȡԱ������ --- ���Ǳ���˾�ġ���������");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("��ȡԱ����ַ -------  ");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("��ȡԱ�������绰--------   ");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("��ȡ����ְλ");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("��ȡԱ����ͥ�绰");
		return null;
	}

}
