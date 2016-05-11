package com.wangx.SimpleFactoryDemo;

import com.wangx.SimpleFactoryDemo.BlackHuman;
import com.wangx.SimpleFactoryDemo.Human;
import com.wangx.SimpleFactoryDemo.HumanFactory;
import com.wangx.SimpleFactoryDemo.WhiteHuman;
import com.wangx.SimpleFactoryDemo.YellowHuman;

/**
 * Hello world!
 *
 */
public class NvWa 
{
    public static void main( String[] args )
    {
    	//女娲第一次造人，火候不足，于是白人产生了
    	System.out.println("--造出的第一批是白人--");
    	Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
    	whiteHuman.getColor();
    	whiteHuman.talk();
    	//女王第二次造人，火候过足，于是黑人产生了
    	System.out.println("\n--造出的第二批人是黑色人种--");
    	Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
    	blackHuman.getColor();
    	blackHuman.talk();
    	//第三次造人，火候刚刚好，于是黄色人种产生了
    	System.out.println("\n--造出的第三批人是黄色人种--");
    	Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
    	yellowHuman.getColor();
    	yellowHuman.talk();
    }
}
