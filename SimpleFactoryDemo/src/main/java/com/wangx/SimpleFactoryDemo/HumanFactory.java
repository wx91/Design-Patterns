package com.wangx.SimpleFactoryDemo;

public class HumanFactory {
	public static <T extends Human> T createHuman(Class<T> c){
		//定义一个生产出的人种
		Human human = null;
		try{
			//生产一个人种
			human = (Human)Class.forName(c.getName()).newInstance();
		}catch(Exception ex){
			System.out.println("人种生产错误！"+ex.getMessage());
		}
		return (T)human;		
	}
}
