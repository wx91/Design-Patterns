package com.wangx.BuilderDemo;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰车跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰车应该这样停车...");
	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoon() {
		System.out.println("奔驰车的引擎室是这个声音的...");
	}

}
