package com.wangx.ExpressionDemo;

import java.util.HashMap;

public class VarExpression extends Expression {
	private String key;
	
	public VarExpression(String key) {
		super();
		this.key = key;
	}
	//从map中取值
	@Override
	public int Interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
