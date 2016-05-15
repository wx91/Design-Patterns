package com.wangx.ExpressionDemo;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}
	//把左右两个表达式运算的结果加起来
	@Override
	public int Interpreter(HashMap<String, Integer> var) {
		return super.left.Interpreter(var)+super.right.Interpreter(var);
	}

}
