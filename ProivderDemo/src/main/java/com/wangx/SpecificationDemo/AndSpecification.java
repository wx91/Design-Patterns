package com.wangx.SpecificationDemo;

public class AndSpecification extends CompositeSpecification {
	//传递两个规格书进行and操作
	private IUserInfoSpecification left;
	private IUserInfoSpecification right;
	
	public AndSpecification(IUserInfoSpecification left, IUserInfoSpecification right) {
		super();
		this.left = left;
		this.right = right;
	}
	//进行and运算
	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user)&&right.isSatisfiedBy(user);
	}

}
