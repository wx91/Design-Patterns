package com.wangx.SpecificationDemo;

public abstract class CompositeSpecification implements IUserInfoSpecification {
	//是否满足条件由实现类实现
	public abstract boolean isSatisfiedBy(User user);
	//and 操作
	public IUserInfoSpecification and(IUserInfoSpecification spec) {
		return new AndSpecification(this,spec);
	}
	//not操作
	public IUserInfoSpecification or(IUserInfoSpecification spec) {
		return new OrSpecification(this,spec);
	}
	//or操作
	public IUserInfoSpecification not() {
		return new NotSpecification(this);
	}

}
