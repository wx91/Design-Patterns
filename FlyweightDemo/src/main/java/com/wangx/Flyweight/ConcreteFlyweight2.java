package com.wangx.Flyweight;

public class ConcreteFlyweight2 extends Flyweight {
	//接受外部状态
	public ConcreteFlyweight2(String _extrinsic) {
		super(_extrinsic);
	}
	//根据外部状态进行逻辑处理
	@Override
	public void operate() {
		
	}

}
