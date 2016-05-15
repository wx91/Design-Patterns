package com.wangx.CompositeDemo;

import java.util.ArrayList;

public interface IBranch {
	//获取信息
	public String getInfo();
	//增加数据节点，比如研发部下设的研发一组
	public void add(IBranch branch);
	//增加叶子节点
	public void add(ILeaf leaf);
	//获取下级信息
	public ArrayList getSubordinateInfo();
}
