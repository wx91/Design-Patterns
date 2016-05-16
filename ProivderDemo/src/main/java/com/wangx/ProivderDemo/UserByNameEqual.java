package com.wangx.ProivderDemo;

public class UserByNameEqual implements IUserInfoSpecification {
	//基准姓名
	private String name;
	//构造函数传递继承者姓名
	public UserByNameEqual(String name) {
		super();
		this.name = name;
	}
	//检验用户是否满足条件
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(name);
	}

}
