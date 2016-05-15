package com.wangx.ObserverDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//定义出韩非子
    	HanFeiZi hanfeizi = new HanFeiZi();
    	//然后我们看看韩非子在干什么
    	hanfeizi.haveBreakfast();
    	//韩非子娱乐了
    	hanfeizi.haveFun();
    	
    }
}
