package com.wangx.StrategyDemo;

public class Context {
	
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	//使用计谋了，看我出招了
	public void opearate(){
		this.strategy.operate();
	}
}
