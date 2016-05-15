package com.wangx.ExpressionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Client {

	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		//赋值
		HashMap<String,Integer> var = getValue(expStr);
		Calculator cal = new Calculator(expStr);
		System.out.println("运算结果为:"+expStr+"="+cal.run(var));
	}
	public static String getExpStr() throws IOException{
		System.out.println("请输入表达式:");
		InputStreamReader reader = new InputStreamReader(System.in);
		String  str = new BufferedReader(reader).readLine();
		return str;
	}
	//获得值映射
	public static HashMap<String,Integer>getValue(String exprStr)throws IOException{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//解析有几个参数要传递
		for(char ch:exprStr.toCharArray()){
			if(ch!='+'&&ch!='-'){
				//解决重复参数问题
				if(!map.containsKey(String.valueOf(ch))){
					InputStreamReader reader = new InputStreamReader(System.in);
					String  in = new BufferedReader(reader).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		
		return map;
	}

}
