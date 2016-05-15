package com.wangx.ObserverDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//定义出韩非子和李斯
    	LiSi lisi =new LiSi();
    	HanFeiZi hanfeizi = new HanFeiZi();
    	//观察早餐
    	Spy watchBreakfast = new Spy(hanfeizi,lisi,"breakfase");
    	//开始启动线程，监控
    	watchBreakfast.start();
    	//观察娱乐情况
    	Spy watchFun = new Spy(hanfeizi,lisi,"fun");
    	watchFun.start();
    	//然后我们看看韩非子在干什么
    	Thread.sleep(1000);//主线程等待1秒后再往下执行
    	hanfeizi.haveFun();
    	
    }
}
