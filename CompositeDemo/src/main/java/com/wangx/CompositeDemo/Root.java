package com.wangx.CompositeDemo;

import java.util.ArrayList;

public class Root implements IRoot {
	//保存根节点的树枝节点和树叶及节点，Subordinate的意思是下级
	private ArrayList<Object> subordinateList = new ArrayList<Object>();
	//根节点的名称
	private String name = "";
	//根节点的职位
	private String position ="";
	//根节点的薪水
	private int salary = 0;
	//通过构造函数传递进来总经理的信息

	public Root(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		String info = "";
		info = info + "名称:"+this.name;
		info = info+"\t职位："+this.position;
		info = info +"\t薪水："+this.salary;
		return info;
	}
	//增加树枝节点
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}
	//增加子节点，比如必输，直接隶属于总经理
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
