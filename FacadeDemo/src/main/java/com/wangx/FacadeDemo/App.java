package com.wangx.FacadeDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//创建一个处理信件的过程
    	ILetterProcess letterProcess = new LetterProcessImpl();
    	//开始写信
    	letterProcess.writeContext("Hello ,It's me,do you know how I am? I'm old lover ,I'd like to....");
    	//开始写信封
    	letterProcess.fillEnvelope("Happy Road No.666 God Province,Heaven");
    	//把信放到信封中，并封装好
    	letterProcess.letterInotoEnvelope();
    	//跑到邮局把信塞到邮箱，投递
    	letterProcess.sendLetter();
    }
}
