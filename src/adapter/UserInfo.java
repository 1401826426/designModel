package adapter;

public class UserInfo implements IUserInfo{

	@Override
	public String getUsername() {
		System.out.println("获取员工名字 --- 我是本公司的。。。。。");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("获取员工地址 -------  ");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("获取员工工作电话--------   ");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("获取工作职位");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("获取员工家庭电话");
		return null;
	}

}
