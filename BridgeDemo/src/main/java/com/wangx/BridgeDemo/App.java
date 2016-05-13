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
    	House house = new House();
    	HouseCorp houseCorp = new HouseCorp(house);
    	//看完怎么挣钱
    	houseCorp.makeMoney();
    	System.out.println("\n");
    	//山寨公司生产的产品很多，不过我只要指定产品就成了
    	System.out.println("-----山寨公司公司是这样运行的-----");
    	ShanZhaiCorp clothesCorp = new ShanZhaiCorp( new Clothes());
    	clothesCorp.makeMoney();
    	System.out.println("\n");
    	
    }
}
