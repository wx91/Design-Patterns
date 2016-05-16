package com.wangx.CompositeDemo;

public class Leaf implements ILeaf{
	//小兵也有名称
	private String name="";
	//小兵也有职位
	private String position = "";
	//小兵也有薪水，否则谁给你干
	private int salary=0;
	//通过构造函数传递信息
	public Leaf(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//获取小兵的信息
	public String getInfo() {
		String info="";
		info = "名称："+this.name;
		info = info+"\t职位："+this.position;
		info = info+"\t薪水："+this.salary;
		return info;
	}




}
