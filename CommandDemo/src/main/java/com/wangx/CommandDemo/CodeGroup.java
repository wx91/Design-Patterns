package com.wangx.CommandDemo;

public class CodeGroup extends Group {
	//客户要求代码组过去和他们谈
	@Override
	public void find() {
		System.out.println("找到代码组...");
	}
	//客户要求增加一项功能
	@Override
	public void add() {
		System.out.println("客户要求增加一项功能...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求修改一项功能...");
	}

	@Override
	public void change() {
		System.out.println("客服要求修改一项功能...");
	}
	//客户要求给出变更计划
	@Override
	public void plan() {
		System.out.println("客户要求代码变更计划...");
	}

}
