package com.wangx.ObserverDemo;

public class HanFeiZi implements IHanFeiZi {
	//韩非子是否在吃饭，作为监控的判断标准
	private boolean isHavingBreakfast = false;
	//韩非子是否在娱乐
	private boolean isHavingFun = false;
	//韩非子要吃饭了
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了...");
		this.isHavingBreakfast=true;
	}
	//韩非子要娱乐了
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了...");
		this.isHavingFun=true;
	}
	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}
	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}
	public boolean isHavingFun() {
		return isHavingFun;
	}
	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	

}
