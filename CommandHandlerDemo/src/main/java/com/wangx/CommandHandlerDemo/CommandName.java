package com.wangx.CommandHandlerDemo;

public abstract class CommandName {
	private CommandName nextOperator;
	public final String handleMessage(CommandVO vo){
		//处理结果
		String result ="";
		//判断是否自己处理的参数
		if(vo.getParam().size()==0||vo.getParam().contains(this.getOperateParam())){
			result = this.echo(vo);
		}else{
			if(this.nextOperator != null){
				result = this.nextOperator.handleMessage(vo);
			}else{
				result ="命令无法执行";
			}
		}
		return result;
	}
	
	//设置剩余参数有谁来处理
	public void setNext(CommandName operator){
		this.nextOperator = operator;
	}
	//每个处理者都要处理一个后缀参数
	protected abstract String getOperateParam();
	//每个矗立着都必须是实现处理任务
	protected abstract String echo(CommandVO vo);

}
