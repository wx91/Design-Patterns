package com.wangx.FlyweightDemo;

public class SignInfo {
	//报考人员的ID
	private String id;
	//邮寄地址
	private String postAddress;
	private ExtrinsicState state;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostAddress() {
		return postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

	public ExtrinsicState getState() {
		return state;
	}

	public void setState(ExtrinsicState state) {
		this.state = state;
	}
	
}
