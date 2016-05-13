package com.wangx.FlyweightDemo;

import java.util.HashMap;

public class SignInfoFactory {
	//池容器
	private static HashMap<ExtrinsicState,SignInfo> pool = new HashMap<ExtrinsicState,SignInfo>();
	
	//报名信息的对象工程
	@Deprecated
	public static SignInfo SignInfo(){
		return new SignInfo();
	}
	
	//从池中获得对象
	public static SignInfo getSignInfo(ExtrinsicState key){
		//设置返回对象
		SignInfo result = null;
		//池中没有对象，则建立，并放入池中
		if(!pool.containsKey(key)){
			result = new SignInfo();
			pool.put(key, result);
		}else{
			result = pool.get(key);
		}
		return result;
		
	}
}
