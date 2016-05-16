package com.wangx.SpecificationDemo;

public class UserByAgeThan extends  CompositeSpecification{
	//基准年龄
	private int age;
	//构造函数传递基准年龄
	public UserByAgeThan(int age) {
		super();
		this.age = age;
	}
	
	public boolean isSatisfiedBy(User user) {
		return user.getAge()>age;
	}
}
