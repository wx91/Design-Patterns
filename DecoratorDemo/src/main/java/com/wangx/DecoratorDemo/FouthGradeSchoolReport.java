package com.wangx.DecoratorDemo;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		//成绩单的格式是这个样子的
		System.out.println("尊敬的XXX家长:");
		System.out.println("  ......  ");
		System.out.println("  语文 62 数学 75 体育 98 自然 63");
		System.out.println("  .....  ");
		System.out.println("          家长签字:      ");
	}
	//家长签字
	public void sign(String name) {
		System.out.println("家长签字名为:"+name);
	}

}
