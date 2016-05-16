package com.wangx.ProivderDemo;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {
	private ArrayList<User> userList;
	
	
	public UserProvider(ArrayList<User> userList) {
		super();
		this.userList = userList;
	}
	//根据用户名查找用户
	public ArrayList<User> findUserByNameEqual(String name) {
		ArrayList<User> result = new ArrayList<User>();
		for (User u:userList){
			if(u.getName().equals(name)){//符合条件用户
				result.add(u);
			}
		}
		return result;
	}
	//年龄大于指定年龄的用户
	public ArrayList<User> findUserByAageThan(int age){
		ArrayList<User> result = new ArrayList<User>();
		for (User u:userList){
			if(u.getAge()>age){//符合条件用户
				result.add(u);
			}
		}
		return result;
	}

}
