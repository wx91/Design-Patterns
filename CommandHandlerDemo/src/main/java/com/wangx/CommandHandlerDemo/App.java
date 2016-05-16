package com.wangx.CommandHandlerDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Invoker invoker = new Invoker();
    	while(true){
    		//在UNIX的默认提示符
    		System.out.println("#");
    		InputStreamReader reader = new InputStreamReader(System.in);
    		String input = new BufferedReader(reader).readLine();
    		//输入quit或exit则退出
    		if(input.equals("quit")||input.equals("exit")){
    			return ;
    		}
    		System.out.println(invoker.exec(input));
    	}
    }
}
