package com.wangx.FacadeDemo;

public class LetterProcessImpl implements ILetterProcess {
	//写信
	public void writeContext(String context) {
		System.out.println("填写信的内容...."+context);
	}
	//在信上填写必要的信息
	public void fillEnvelope(String address) {
		System.out.println("填写收件人地址及姓名...."+address);
	}
	//把信放到信封中，并封好
	public void letterInotoEnvelope() {
		System.out.println("把信放到信封中....");
	}

	public void sendLetter() {
		System.out.println("邮递信件....");
	}

}
