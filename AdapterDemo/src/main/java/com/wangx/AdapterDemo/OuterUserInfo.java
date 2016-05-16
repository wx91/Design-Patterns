package com.wangx.AdapterDemo;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
	private Map<String, String> baseInfo = super.getUserBaseInfo();//员工的基本信息
	private Map<String,String> homeInfo = super.getUserHomeInfo();//员工的家庭信息
	private Map<String,String> officeInfo = super.getUserOfficeInfo();//工作信息

	public String getUserName() {
		String userName = (String)this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	public String getHomeAddress() {
		String homeAddress = (String)this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	public String getMobileNumber() {
		String mobileNumber =(String)this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	public String getOfficeTelNumber() {
		String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	public String getJobPosistio() {
		String jobPosition = (String)this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	public String getHomeTelNumber() {
		String homeTelNumber =(String)this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
