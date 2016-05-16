package com.wangx.SpecificationDemo;

public interface IUserInfoSpecification {
	//候选者是否满足要求
	public boolean isSatisfiedBy(User user);
	//and操作
	public IUserInfoSpecification and(IUserInfoSpecification spec);
	//or操作
	public IUserInfoSpecification or(IUserInfoSpecification spec);
	//not操作
	public IUserInfoSpecification not();
}
