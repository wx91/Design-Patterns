package com.wangx.BuilderDemo;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车应该这样停车...");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这样个样子的...");
	}

	@Override
	protected void engineBoon() {
		System.out.println("宝马车的引擎是这个声音的...");
	}

}
