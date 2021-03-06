package com.wangx.VisitorDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//展示报表访问者
    	IShowVisitor showVisitor = new ShowVisitor();
    	//汇总报表的访问者
    	ITotalVisitor totalVisitor = new TotalVisitor();
    	for(Employee emp:mockEmployee()){
    		emp.accept(showVisitor);
    		emp.accept(totalVisitor);
    	}
    	//展示baob
    	showVisitor.report();
    	totalVisitor.totalSalary();
    }
    public static List<Employee> mockEmployee(){
    	List<Employee> empList = new ArrayList<Employee>();
    	//产生张三这个员工
    	CommonEmployee zhangsan = new CommonEmployee();
    	zhangsan.setJob("编写Java程序,绝对的蓝领，苦工加搬运工");
    	zhangsan.setName("张三");
    	zhangsan.setSalary(1800);
    	zhangsan.setSex(Employee.MALE);
    	empList.add(zhangsan);
    	//生产李四这个员工
    	CommonEmployee lisi = new CommonEmployee();
    	lisi.setJob("页面美工，审美素质太不流行了!");
    	lisi.setName("李四");
    	lisi.setSalary(1900);
    	lisi.setSex(Employee.FEMALE);
    	empList.add(lisi);
    	//在生产一个经理
    	Manager wangwu = new Manager();
    	wangwu.setName("王五");
    	wangwu.setPerformance("基本上是负值，但是我会拍马屁呀");
    	wangwu.setSalary(18750);
    	wangwu.setSex(Employee.MALE);
    	empList.add(wangwu);
    	return empList;
    }
}
