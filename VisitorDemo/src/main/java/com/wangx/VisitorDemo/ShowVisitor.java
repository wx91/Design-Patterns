package com.wangx.VisitorDemo;

public class ShowVisitor implements IShowVisitor {
	private String info = "";

	public void visit(CommonEmployee commonEmployee) {
		this.info = this.info+this.getBasicInfo(commonEmployee)+"工作:"+commonEmployee.getJob()+"\t\n";
	}

	public void visit(Manager mananger) {
		this.info = this.info+this.getBasicInfo(mananger)+"业绩:"+mananger.getPerformance()+"\t\n";
	}
	//组装基本信息
	private String getBasicInfo(Employee employee){
		String info = "姓名:" +employee.getName()+ "\t";
		info = info+"性别："+(employee.getSex() == Employee.FEMALE?"女":"男")+"\t";
		info = info+"薪水:"+employee.getSalary()+"\t";
		return info;
	}

	public int getTotalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	//打印出报表
	public void report() {
		System.out.println(this.info);
	}

}
