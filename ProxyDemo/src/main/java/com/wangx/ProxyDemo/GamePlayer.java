package com.wangx.ProxyDemo;

public class GamePlayer implements IGamePlayer {
	private String name = "";
	
	public GamePlayer(String _name){
		this.name=_name;
	}
	//进游戏之前你肯定要登陆吧，这是一个必要条件
	public void login(String user, String password) {
		System.out.println("登陆名为："+user+"的用户"+this.name+"登陆成功");
	}
	//打怪，最期望就是杀老怪
	public void killBoss() {
		System.out.println(this.name+"在打怪");
	}
	//升级，升级有很多方法，花钱买是一种，做任务也是一种
	public void upgrade() {
		System.out.println(this.name+"又升一级！");
	}

}
