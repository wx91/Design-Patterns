package com.wangx.ModelDemo;

public class HummerH2Model extends HummerModel {
	//汽车发动
	@Override
	public void start() {
		System.out.println("悍马H2发动...");
	}
	//停车
	@Override
	public void stop() {
		System.out.println("悍马H2停车...");
	}
	//H2型号哈密码鸣笛
	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}
	//引擎轰鸣声
	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声音是这样在...");
	}
	//钩子方法，默认喇叭是会响的
	protected boolean isAlarm(){
		return false;
	}


}
