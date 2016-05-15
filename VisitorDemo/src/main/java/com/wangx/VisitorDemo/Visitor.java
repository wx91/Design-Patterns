package com.wangx.VisitorDemo;

public class Visitor implements IVisitor {
	//访问普通员工，打印出报表
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	public void visit(Manager mananger) {
		System.out.println(this.getManagerInfo(mananger));
	}
	//组装基本信息
	private String getBasicInfo(Employee employee){
		String info = "姓名:" +employee.getName()+ "\t";
		info = info+"性别："+(employee.getSex() == Employee.FEMALE?"女":"男")+"\t";
		info = info+"薪水:"+employee.getSalary()+"\t";
		return info;
	}
	//组装出部门经理的信息
	private String getManagerInfo(Manager manager){
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩"+manager.getPerformance()+"\t";
		return basicInfo+otherInfo;
	}
	//组装出普通员工信息
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作"+commonEmployee.getJob()+"\t";
		return basicInfo+otherInfo;
	}

}
