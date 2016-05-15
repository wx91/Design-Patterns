package com.wangx.ObserverDemo;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi,Observable {
	//定义个变长数组，存放所有观察者
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	//韩非子要吃饭了
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了...");
		//通知李斯
		this.notifyObservers("韩非子在吃饭");
	}
	//韩非子要娱乐了
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了...");
		this.notifyObservers("韩非子在娱乐");
	}
	//增加观察者
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}
	public void notifyObservers(String context) {
		for(Observer observer:observerList){
			observer.update(context);
		}
	}

}
