package com.wangx.AdapterDemo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
	//用户的基本信息
	public Map<String,String> getUserBaseInfo() {
		HashMap<String,String> baseInfoMap = new HashMap<String,String>();
		baseInfoMap.put("userName", "这个员工交混世魔王....");
		baseInfoMap.put("mobileNumber", "这个员工的电话是....");
		return baseInfoMap;
	}
	//员工的家庭信息
	public Map<String,String> getUserOfficeInfo() {
		HashMap<String,String> homeInfo = new HashMap<String,String>();
		homeInfo.put("homeTelNumber", "员工的家庭电话是....");
		homeInfo.put("homeAddress", "员工的家庭地址是....");
		return null;
	}

	public Map<String,String> getUserHomeInfo() {
		HashMap<String,String> officeInfo = new HashMap<String,String>();
		officeInfo.put("jobPosition", "这个人的职位是Boss...");
		officeInfo.put("officeTelNumber", "员工的办公司电话是...");
		return officeInfo;
	}

}
