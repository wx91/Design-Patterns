package com.wangx.AdapterDemo;

import java.util.Map;

public interface IOuterUser {
	//基本信息，如名称，性别，手机号码等
	public Map<String,String> getUserBaseInfo();
	//工作区域信息
	public Map<String,String> getUserOfficeInfo();
	//用户家庭信息
	public Map<String,String> getUserHomeInfo();

}
