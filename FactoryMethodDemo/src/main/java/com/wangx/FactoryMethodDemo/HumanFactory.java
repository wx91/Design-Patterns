package com.wangx.FactoryMethodDemo;

public interface HumanFactory {
	//创造一个黄色人种
	public Human createYellowHuman();
	//创造一个白色人种
	public Human createWhiteHuman();
	//创造一个黑色人种
	public Human createBlackHuman();
}
