package com.wangx.BridgeDemo;

public class IPodCorp extends Corp {
	//我开始生产iPod了
	@Override
	protected void produce() {
		System.out.println("我生产iPod...");
	}
	//山寨的iPod很畅销，很便宜嘛
	@Override
	protected void sell() {
		System.out.println("iPod畅销...");
	}
	//狂赚钱
	public void makeMoney(){
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}

}
