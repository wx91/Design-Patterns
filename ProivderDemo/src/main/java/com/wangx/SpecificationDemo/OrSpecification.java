package com.wangx.SpecificationDemo;

public class OrSpecification extends CompositeSpecification {
	//传递两个规格书进行and操作
	private IUserInfoSpecification left;
	private IUserInfoSpecification right;
	
	public OrSpecification(IUserInfoSpecification left, IUserInfoSpecification right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user)||right.isSatisfiedBy(user);
	}

}
