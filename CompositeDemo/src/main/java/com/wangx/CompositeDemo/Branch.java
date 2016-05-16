package com.wangx.CompositeDemo;

import java.util.ArrayList;

public class Branch extends Corp {
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	//领导下面有哪些下级领导和小兵
	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	
	//增加一个下属，可能是小头目，也可能是小兵
	public void addSubordinate(Corp corp){
		this.subordinateList.add(corp);
	}
	//我有哪些下属
	public ArrayList<Corp> getSubordinateInfo() {
		return this.subordinateList;
	}

}
