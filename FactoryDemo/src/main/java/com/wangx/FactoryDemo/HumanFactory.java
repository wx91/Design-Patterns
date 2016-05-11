package com.wangx.FactoryDemo;

public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//定义一个生产的人种
		Human human = null;
		try{
			human = (Human)Class.forName(c.getName()).newInstance();
		}catch(Exception ex){
			System.out.println("人种生产错误!"+ex.getMessage());
		}
		return (T)human;
	}
	

}
