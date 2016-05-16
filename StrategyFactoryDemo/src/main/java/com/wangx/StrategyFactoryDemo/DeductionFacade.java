package com.wangx.StrategyFactoryDemo;

public class DeductionFacade {
	//对外公布扣款信息
	public static Card deduct(Card card,Trade trade){
		//获取消费策略
		StrategyMan reg = getDeductionType(trade);
		//初始化一个消费策略
		IDeduction deduction = StrategyFactory.getDeducation(reg);
		//产生一个策略上下文
		DeductionContext context = new DeductionContext(deduction);
		//进行扣款处理
		context.exec(card, trade);
		return card;
	}
	//
	private static StrategyMan getDeductionType(Trade trade){
		//模拟操作
		if(trade.getTradeNo().contains("abc")){
			return  StrategyMan.FreeDeduction;
		}else{
			return StrategyMan.SteadyDeduction;
		}
	}
}
