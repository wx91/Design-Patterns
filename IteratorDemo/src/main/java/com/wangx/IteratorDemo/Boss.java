package com.wangx.IteratorDemo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Boss 
{
    public static void main( String[] args )
    {
    	//定义一个List，存放所有的项目对象
    	ArrayList<IProject> projectList = new ArrayList<IProject>();
    	//增加新球大战项目
    	projectList.add(new Project("星球大战项目",10,100000));
    	//增加扭转时空项目
    	projectList.add(new Project("扭转时空项目",100,1000000));
    	//增加超人改造项目
    	projectList.add(new Project("超人改造项目",1000,10000000));
    	//这边100个项目
    	for(int i = 4;i<14;i++){
    		projectList.add(new Project("第"+"个项目",i*5,i*1000000));
    	}
    	//遍历一下ArrayList,把所有的数据都取出来
    	for (IProject project:projectList){
    		System.out.println(project.getProjectInfo());
    	}
    }
}
