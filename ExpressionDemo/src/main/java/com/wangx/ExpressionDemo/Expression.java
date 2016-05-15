package com.wangx.ExpressionDemo;

import java.util.HashMap;

public abstract class Expression {
	//解析公式和数值，其中var中的key值是 公式中的参数，value值是具体的数据
	public abstract int Interpreter(HashMap<String,Integer> var);
	
}
