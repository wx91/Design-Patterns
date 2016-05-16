package com.wangx.CommandHandlerDemo;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
	ls("com.wangx.CommandHandlerDemo.LSCommand");
	
	private String value="";
	//定义构造函数，目的是Data（value）类型的想匹配
	private CommandEnum(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	//返回所有的enum对象
	public static List<String> getNames(){
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for (CommandEnum c:commandEnum){
			names.add(c.name());
		}
		return names;
	}

}
