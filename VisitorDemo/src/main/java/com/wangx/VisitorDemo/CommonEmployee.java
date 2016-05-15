package com.wangx.VisitorDemo;

public class CommonEmployee extends Employee {
	//工作内容，这非常重要，以后的职业规划就是靠他
	private String job;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String getOtherInfo() {
		return "工作"+this.job+"\t";
	}

}
