package com.wangx.DecoratorDemo;
//Decorator
public class Decorator extends SchoolReport {
	//首先我要知道是哪个成绩单
	private SchoolReport sr;
	//构造函数，传递成绩单过来
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	//成绩单还是要被看到的
	@Override
	public void report() {
		this.sr.report();
	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
