package com.wangx.Flyweight;

public class ConcreteFlyweight1 extends Flyweight {
	//接受外部状态
	public ConcreteFlyweight1(String _extrinsic) {
		super(_extrinsic);
	}
	//根据外部状态进行处理
	@Override
	public void operate() {
		//业务逻辑
	}

}
