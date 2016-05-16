package com.wangx.AdapterDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IUserInfo Girl = new OuterUserInfo();
    	for(int i=0;i<11;i++){
    		Girl.getMobileNumber();
    	}
    }
}
