package com.wangx.FactoryMethodDemo;

public class FemaleFactory implements HumanFactory {
	//生产黄人女性
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}
	//生产白人女性
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}
	//产生黑人女性
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
