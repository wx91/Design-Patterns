package com.wangx.StrategyFactoryDemo;

public class DeductionContext {
	//扣款策略
	private IDeduction deduction = null;
	//构造函数

	public DeductionContext(IDeduction deduction) {
		super();
		this.deduction = deduction;
	}
	//执行扣款
	public boolean exec(Card card,Trade trade){
		return this.deduction.exec(card, trade);
	}
	
}
