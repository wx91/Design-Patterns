package com.wangx.FlyweightDemo;

public class ExtrinsicState {
	//考试科目
	private String subject;
	//考试地点
	private String localtion;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocaltion() {
		return localtion;
	}
	public void setLocaltion(String localtion) {
		this.localtion = localtion;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof ExtrinsicState){
			ExtrinsicState state = (ExtrinsicState)obj;
			return state.getLocaltion().equals(localtion)&&state.getSubject().equals(subject);
		}
		return false;
	}
	@Override
	public int hashCode(){
		return  subject.hashCode()+localtion.hashCode();
	}
}
