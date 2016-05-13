package com.wangx.BridgeDemo;

public class ShanZhaiCorp extends Corp {
	//产什么产品，不知道，被调用的时候才知道
	public ShanZhaiCorp(Product product) {
		super(product);
	}
	//狂赚钱
	public void makeMoney(){
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}

}
