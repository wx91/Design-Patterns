package com.wangx.ObserverDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//三个观察者产生出来
    	Observer lisi = new LiSi();
    	Observer wangsi = new WangSi();
    	Observer liusi = new LiuSi();
    	//定义出韩非子
    	HanFeiZi hanfeizi = new HanFeiZi();
    	//我们后人根据李斯，描述这个场景，有三个人在观察韩非子
    	hanfeizi.addObserver(lisi);
    	hanfeizi.addObserver(wangsi);
    	hanfeizi.addObserver(liusi);
    	//然后我们看看韩非子在干什么
    	hanfeizi.haveBreakfast();
    	//韩非子娱乐了
    	hanfeizi.haveFun();
    	
    }
}
