package com.wangx.ProivderDemo;

public class User {
	//姓名
	private String name;
	//年龄
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//用户信息打印
	@Override
	public String toString(){
		return "用户名："+name+"\t年龄："+age;
	}
}
