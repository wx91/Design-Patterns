package com.wangx.HandlerDemo;

public class Women implements IWomen {
	/*	通过一个int类型的参数来描述妇女的个人情况
	 * 	1--未出嫁
	 * 	2--出嫁
	 * 	3--父死
	 */
	private int type=0;
	//妇女的请示
	private String request="";
	//构造函数
	public Women(int _type,String _request){
		this.type = _type;
		if(this.type == 1){
			this.request="女儿的请求是:"+_request;
		}else if(this.type == 2){
			this.request = "妻子的请求是："+_request;
		}else if(this.type == 3){
			this.request = "母亲的请求是:"+_request;
		}
	}
	//获得自己的情况
	public int getType() {
		return this.type;
	}
	//获取妇女的请求
	public String getRequest() {
		return this.request;
	}

}
