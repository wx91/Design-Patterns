package com.wangx.DecoratorDemo;
//ConcreteDecorator
public class HighScoreDecorator extends Decorator {
	//构造函数
	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	//我要在老爸看成绩单之前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说
	public void report(){
		this.reportHighScore();
		super.report();
	}

}
