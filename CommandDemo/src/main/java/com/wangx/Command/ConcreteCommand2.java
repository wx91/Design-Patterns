package com.wangx.Command;

public class ConcreteCommand2 extends Command {
	//对那个Receiver类进行命令处理
	private Receiver receiver;
	//构造函数传递接受者
	public  ConcreteCommand2( Receiver _receiver){
		this.receiver = _receiver;
	}
	@Override
	public void execute() {
		this.receiver.doSomething();
	}

}
