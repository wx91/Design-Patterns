package com.wangx.BuilderDemo;

import java.util.ArrayList;

public abstract class CarBuilder {
	//创造一个模型，你给我一个顺序，就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置顺序完毕后，就可直接难道这个车辆模型
	public abstract CarModel getCarModel();

}
