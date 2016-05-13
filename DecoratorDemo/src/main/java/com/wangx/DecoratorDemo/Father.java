package com.wangx.DecoratorDemo;

/**
 * Hello world!
 *
 */
public class Father 
{
    public static void main( String[] args )
    {
    	//把成绩单拿过来
    	SchoolReport sr;
    	//原装的成绩单
    	sr = new FouthGradeSchoolReport();
    	//加了最高分说明的成绩单
    	sr = new HighScoreDecorator(sr);
    	//又加了成绩排名的说明
    	sr = new SortDecorator(sr);
    	//看成绩单
    	sr.report();
    	//然后老爸，一看，很开心，就签字了
    	sr.sign("老三");
    }
}
