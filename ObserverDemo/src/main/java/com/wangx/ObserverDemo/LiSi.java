package com.wangx.ObserverDemo;

public  class LiSi implements Observer{
	//首先李斯是个观察着，一旦韩非子有活动，他就知道，他就要像老板汇报
	public void update(String str) {
		System.out.println("李斯：观察到韩非子活动，开始想老板汇报了...");
		this.reportToQiShiHuang(str);
		System.out.println("李斯：汇报完毕...\n");
		
	}
	private void reportToQiShiHuang(String reportContext){
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
	}

}
