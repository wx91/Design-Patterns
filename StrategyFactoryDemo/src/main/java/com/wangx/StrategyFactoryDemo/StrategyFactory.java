package com.wangx.StrategyFactoryDemo;

public class StrategyFactory {
	//策略工厂
	public static IDeduction getDeducation(StrategyMan strategy){
		IDeduction deduction = null;
		try{
			deduction = (IDeduction)Class.forName(strategy.getValue()).newInstance();
		}catch(Exception ex){
			 ex.printStackTrace();
		}
		return deduction;
	}
}
