package com.wangx.ObserverDemo;

public class WangSi implements Observer {

	public void update(String str) {
		System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
		this.cry(str);
		System.out.println("王斯：哭死了...\n");
	}
	private void cry(String context){
		System.out.println("王斯：因为"+context+"，所有我悲伤呀");
	}

}
