package com.wangx.MementoDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//声明出主角
    	Boy boy = new Boy();
    	//初始化当前状态
    	boy.setState("心情很棒！");
    	System.out.println("=====男孩现在的状态=====");
    	System.out.println(boy.getState());
    	//需要记录下当前状态呀
    	Memento men = boy.createMemento();
    	//男孩去追女孩，状态改变
    	boy.changeState();
    	System.out.println("\n=====男孩追求女孩子后的状态=====");
    	System.out.println(boy.getState());
    	//追女孩失败，恢复原状
    	boy.restoreMemento(men);
    	System.out.println("\n=====男孩恢复后的状态=====");
    	System.out.println(boy.getState());
    }
}
