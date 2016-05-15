package com.wangx.VisitorDemo;

public class TotalVisitor implements ITotalVisitor {
	//部门经理的工资系数是5
	private final static int MANAGER_COEFFICIENT =5;
	//员工的工资系数是2
	private final static int COMMONEMPLOYEE_COEFFICIENT=2;
	
	//普通员工的工资总和
	private int commonTotalSalary = 0;
	//部门经理的工资总和
	private int managerTotalSalary=0;
	//访问普通员工，计算工资总额
	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalary = this.commonTotalSalary+commonEmployee.getSalary()*COMMONEMPLOYEE_COEFFICIENT;
	}
	//访问部门经理，计算工资总额
	public void visit(Manager mananger) {
		this.managerTotalSalary = this.managerTotalSalary+mananger.getSalary()*MANAGER_COEFFICIENT;
	}
	//获得所有员工的工资总和
	public void totalSalary() {
		System.out.println("本公司的月工资总额是"+( this.commonTotalSalary+this.managerTotalSalary));
	}

}
