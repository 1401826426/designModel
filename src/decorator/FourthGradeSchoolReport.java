package decorator;

public class FourthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		System.out.println("�𾴵�XXX�ҳ�");
		System.out.println("...........");
		System.out.println("����62 �� ��ѧ65 �� ����98 �� ��Ȼ63");
		System.out.println("             �ҳ�ǩ��:           ");
	}

	@Override
	public void sign(String name) {
		System.out.println("�ҳ�ǩ��Ϊ:  " + name);
	}

}