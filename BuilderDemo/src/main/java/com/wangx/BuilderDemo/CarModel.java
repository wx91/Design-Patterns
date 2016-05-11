package com.wangx.BuilderDemo;

import java.util.ArrayList;

public abstract class CarModel {
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	//模型是启动开始跑了
	protected abstract void start();
	//能发动，那还要能停下来，那才是真本事
	protected abstract void stop();
	//喇叭会出声音，是滴滴叫，还是哔哔叫
	protected abstract void alarm();
	//引擎会轰隆隆地响，不响那时假的
	protected abstract void engineBoon();
	//那模型应该会跑吧，别管是人推的，还是电力驱动，总之要回跑
	final public void run(){
		//循环一编，谁在前，就先执行谁
		for(int i=0;i<this.sequence.size();i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();//开启汽车
			}else if(actionName.equalsIgnoreCase("stop")){
				this.stop();//停止汽车
			}else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();
			}else if(actionName.equalsIgnoreCase("engine boom")){
				this.engineBoon();
			}
		}
	}
	final public void setSequence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
	
}
