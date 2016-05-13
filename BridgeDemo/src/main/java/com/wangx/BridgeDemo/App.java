package com.wangx.BridgeDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("------服装地产公司是这样运行的-----");
    	//先找到我的公司
    	HouseCorp houseCorp = new HouseCorp();
    	//看完怎么挣钱
    	houseCorp.makeMoney();
    	System.out.println("\n");
    	System.out.println("-----服装公司是这样运行的-----");
    	ClothesCorp clothesCorp = new ClothesCorp();
    	clothesCorp.makeMoney();
    	
    }
}
