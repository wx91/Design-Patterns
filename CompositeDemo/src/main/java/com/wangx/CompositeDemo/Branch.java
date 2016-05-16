package com.wangx.CompositeDemo;

import java.util.ArrayList;

public class Branch implements IBranch {
	
	
	//领导人也是人，也有名字
	private String name="";
	//领导和领导不同，也就是职位区别
	private String position = "";
	//领导也是拿薪水的
	private int salary=0;
	//领导下面有哪些下级领导和小兵
	private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	//通过构造函数传递领导的信息
	public Branch(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		String info = "";
		info = "名称："+this.name;
		info = info +"\t职位："+this.position;
		info = info+"\t薪水："+this.salary;
		return info;
	}
	//增加一个下属，可能是小头目，也可能是小兵
	public void addSubordinate(ICorp corp){
		this.subordinateList.add(corp);
	}
	//我有哪些下属
	public ArrayList<ICorp> getSubordinateInfo() {
		return this.subordinateList;
	}

}
