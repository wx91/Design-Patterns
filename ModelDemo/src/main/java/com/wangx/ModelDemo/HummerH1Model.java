package com.wangx.ModelDemo;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;//要响喇叭
	@Override
	public void start() {
		System.out.println("悍马H1发动...");
	}

	@Override
	public void stop() {
		System.out.println("悍马H1停车...");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");
	}
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
