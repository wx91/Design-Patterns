package com.wangx.StrategyFactoryDemo;

public class FreeDeduction implements IDeduction {

	public boolean exec(Card card, Trade trade) {
		//直接从自余额中扣除
		card.setFreeMoney(card.getFreeMoney()-trade.getAmount());
		return true;
	}
}


