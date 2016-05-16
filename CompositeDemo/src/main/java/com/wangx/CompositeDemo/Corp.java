package com.wangx.CompositeDemo;

public abstract class Corp {
	//公司每个人都有名称
	private String name="";
	//公司每个人都有职位
	private String position = "";
	//公司每个人都有薪水
	private int salary=0;
	
	public Corp(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//获取员工信息
	public String getInfo() {
		String info = "";
		info = "名称："+this.name;
		info = info +"\t职位："+this.position;
		info = info+"\t薪水："+this.salary;
		return info;
	}
}
