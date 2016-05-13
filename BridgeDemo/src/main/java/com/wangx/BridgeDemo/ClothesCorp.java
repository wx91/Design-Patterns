package com.wangx.BridgeDemo;

public class ClothesCorp extends Corp {
	
	public ClothesCorp(Clothes clothes) {
		super(clothes);
	}

	//服装公司不景气，但怎么说也是赚钱行业
	public void makeMoney(){
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}
}
