package com.wangx.PrototypeDemo;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
	//发送账单的数量，这个值是从数据库中获取
	private static int MAX_COUNT = 6;
	
    public static void main( String[] args )
    {
    	//模拟发送邮件
    	int i = 0;
    	//把模板定义出来，这个是用数据库中获取
    	Mail mail = new Mail(new AdvTemplate());
    	mail.setTail("XX银行版权所有");
    	while(i<MAX_COUNT){
    		//已下是每封邮件不同的地方
    		mail.setAppellation(getRandString(5)+"先生（女士）");
    		mail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
    		//然后发送邮件
    		sendMail(mail);
    		i++;
    	}
    }
    //发送邮件
    public static void sendMail(Mail mail){
    	System.out.println("标题:"+mail.getSubject()+"\t收件人:"+mail.getReceiver()+"\t...发送成功！");
    	
    }
    
    //获得制指定长度的随机字符串
    public static String getRandString(int maxLength){
    	String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	StringBuffer sb = new StringBuffer();
    	Random rand = new Random();
    	for(int i=0;i<maxLength;i++){
    		sb.append(source.charAt(rand.nextInt(source.length())));
    	}
    	return sb.toString();
    }
}
