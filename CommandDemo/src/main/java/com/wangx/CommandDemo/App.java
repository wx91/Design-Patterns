package com.wangx.CommandDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//定义我们的接头人
    	Invoker xiaoSan = new Invoker();//接头人就是小三
    	//首先客户找到需求组说，过来谈谈需求，并修改
    	System.out.println("-----客户要求增加一项需求-----");
    	Command command = new AddRequirementCommand();
    	//接头人接受到命令
    	xiaoSan.setCommand(command);
    	//接头人执行命令
    	xiaoSan.action();
    }
}
