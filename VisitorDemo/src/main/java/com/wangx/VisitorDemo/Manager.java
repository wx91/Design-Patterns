package com.wangx.VisitorDemo;

public class Manager extends Employee {
	//这类人物的职责非常明确,业绩
	private String performance;
	
	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	//我允许访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
