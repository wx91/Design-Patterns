package com.wangx.HandlerDemo;

public class Son extends Handler {
	//儿子只处理母亲的请求
	public Son(){
		super(Handler.SON_LEVEL_REQUEST);
	}
	public void response(IWomen women) {
		System.out.println("-----母亲想儿子请示-----");
		System.out.println(women.getRequest());
		System.out.println("儿子的回复是:同意\n");
	}

}
