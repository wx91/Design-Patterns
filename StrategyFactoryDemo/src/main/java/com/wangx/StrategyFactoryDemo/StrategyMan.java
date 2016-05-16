package com.wangx.StrategyFactoryDemo;

public enum StrategyMan {
	SteadyDeduction("com.wangx.StrategyFactoryDemo.SteadyDeduction"),
	FreeDeduction("com.wangx.StrategyFactoryDemo.FreeDeduction");
	String value = "";
	private StrategyMan(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}

}
