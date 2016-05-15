package com.wangx.ExpressionDemo;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}
	//左右两个表达式相减
	@Override
	public int Interpreter(HashMap<String, Integer> var) {
		return super.left.Interpreter(var)-super.right.Interpreter(var);
	}

}
