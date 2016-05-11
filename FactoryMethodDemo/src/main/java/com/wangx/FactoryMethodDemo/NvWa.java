package com.wangx.FactoryMethodDemo;

/**
 * Hello world!
 *
 */
public class NvWa 
{
    public static void main( String[] args )
    {
    	//第一条生产线，男性生产线
    	HumanFactory  maleHumanFactory =  new MaleFactory();
    	//第二条，女性生产线
    	HumanFactory femaleHumanFactory = new FemaleFactory();
    	//生产线建立完毕，开始生产人了:
    	Human maleYellowHuman = maleHumanFactory.createWhiteHuman();
    	Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
    	System.out.println("---生产一个黄色女性---");
    	femaleYellowHuman.getColor();
    	femaleYellowHuman.talk();
    	femaleYellowHuman.getSex();
    	System.out.println("\n--- 生产一个黄色男性---");
    	maleYellowHuman.getColor();
    	maleYellowHuman.talk();
    	maleYellowHuman.getSex();
    	
    }
}
