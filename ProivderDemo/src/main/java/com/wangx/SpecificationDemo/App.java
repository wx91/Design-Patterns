package com.wangx.SpecificationDemo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//首先初始化一批用户
    	ArrayList<User> userList = new ArrayList<User>();
    	userList.add(new User("苏国庆",23));
    	userList.add(new User("国庆牛",82));
    	userList.add(new User("张国庆三",10));
    	userList.add(new User("李四",10));
    	//定义一个用户查询类
    	IUserProvider userProvider = new UserProvider(userList);
    	//打印出年龄大于20岁的用户
    	System.out.println("===名字包含国庆的人员===");
    	//定义一个规格书
    	IUserInfoSpecification userSpec1 = new UserByNameLike("%国庆%");
    	IUserInfoSpecification userSpec2 = new UserByAgeThan(25);
    	for(User u:userProvider.findUser(userSpec1.and(userSpec2))){
    		System.out.println(u);
    	}
    }
}
