package com.wangx.BridgeDemo;

public class IPodCorp extends Corp {
	
	public IPodCorp(IPod product) {
		super(product);
	}

	//狂赚钱
	public void makeMoney(){
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}

}
