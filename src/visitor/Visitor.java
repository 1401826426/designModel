package visitor;

public class Visitor implements IVisitor{

	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee) ; 
		String otherInfo = "����:" + commonEmployee.getJob()  + "\t";
		return basicInfo + otherInfo; 
	}

	private String getBasicInfo(Employee employee) {
		String info = "����:" + employee.getName() + "\t" ;
		info = info + "�Ա�:" + (employee.getSex() == Employee.FEMALE?"Ů":"��") + "\t" ;
		info = info + "нˮ:" + employee.getSalary() + "\t"; 
		return info ; 
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager) ; 
		String otherInfo = "ҵ��: " + manager.getPerformance() +"\t" ; 
		return basicInfo + otherInfo;
	}

}



















