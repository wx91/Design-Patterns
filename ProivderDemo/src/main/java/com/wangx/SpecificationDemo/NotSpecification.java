package com.wangx.SpecificationDemo;

public class NotSpecification extends CompositeSpecification{
	//传递一个规格书
	private IUserInfoSpecification spec;

	public NotSpecification(IUserInfoSpecification spec) {
		super();
		this.spec = spec;
	}
	//not操作

	@Override
	public boolean isSatisfiedBy(User user) {
		return !spec.isSatisfiedBy(user);
	}
	
}
