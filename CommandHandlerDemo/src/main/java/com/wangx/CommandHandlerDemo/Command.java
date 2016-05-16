package com.wangx.CommandHandlerDemo;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
	public abstract String execute(CommandVO vo);
	//建立链表
	protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass){
		//取出所有的命令下的子类
		List<Class> classes = ClassUtils.getSonClass(abstractClass);
		//存放命令的实例，并建立链表
		List<CommandName> commandNameList = new ArrayList<CommandName>();
		for(Class c:classes){
			CommandName commandName = null;
			try {
				commandName = (CommandName)Class.forName(c.getName()).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			//建立链表
			if(commandNameList.size() > 0){
				commandNameList.get(commandNameList.size()-1).setNext(commandName);
			}
			commandNameList.add(commandName);
		}
		return commandNameList;
	}

}
