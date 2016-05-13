package com.wangx.FlyweightDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//初始化对象池
    	ExtrinsicState state1 = new ExtrinsicState();
    	state1.setSubject("科目1");
    	state1.setLocaltion("上海");
    	SignInfoFactory.getSignInfo(state1);
    	long currentTime = System.currentTimeMillis();
    	for(int i=0;i<100;i++){
    		SignInfoFactory.getSignInfo(state1);
    	}
    	long tailTime = System.currentTimeMillis();
    }
}
