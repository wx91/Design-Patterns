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
    	SchoolReport sr = new SugarFouthGradeSchoolReport();
    	//看成绩单
    	sr.report();
    	//然后老爸，一看，很开心，就签字了
    	sr.sign("老三");
    }
}
