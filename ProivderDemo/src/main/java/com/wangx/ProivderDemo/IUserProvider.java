package com.wangx.ProivderDemo;

import java.util.ArrayList;

public interface IUserProvider {
	//根据条件查询用户
	public ArrayList<User> findUser(IUserInfoSpecification userSpec);
}
