package com.wangx.BridgeDemo;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产出来的iPod是这样的...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出来的iPod卖出去了...");
	}

}
