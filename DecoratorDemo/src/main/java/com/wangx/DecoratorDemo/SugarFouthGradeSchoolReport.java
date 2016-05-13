package com.wangx.DecoratorDemo;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	//首先要定义你要美化的方法，先给老爸说学校最高成绩
	private void reportHightScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	//在老爸看完毕成绩单后，我在汇报学校的排名情况
	private void reportSort(){
		System.out.println("我是排名第38名...");
	}
	//由于回报的内容已经发生变更，那所以要重写父类
	@Override
	public void report(){
		this.reportHightScore();	//先说最高成绩
		super.report();		//然后老爸看成绩单
		this.reportSort();	//然后告诉老爸学校的排名
	}
	
}
