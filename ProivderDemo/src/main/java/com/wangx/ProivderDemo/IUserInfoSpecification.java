package com.wangx.ProivderDemo;

public interface IUserInfoSpecification {
	//候选者是否满足要求
	public boolean isSatisfiedBy(User user);
}