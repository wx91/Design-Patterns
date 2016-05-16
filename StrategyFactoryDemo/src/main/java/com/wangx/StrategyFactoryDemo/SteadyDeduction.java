package com.wangx.StrategyFactoryDemo;

public class SteadyDeduction implements IDeduction {

	public boolean exec(Card card, Trade trade) {
		//固定金额和自由金额扣除50%
		int halfMoney = (int)Math.rint(trade.getAmount()/2.0);
		card.setFreeMoney(card.getFreeMoney()-halfMoney);
		card.setSteadyMoney(card.getSteadyMoney()-halfMoney);
		return true;
	}

}
