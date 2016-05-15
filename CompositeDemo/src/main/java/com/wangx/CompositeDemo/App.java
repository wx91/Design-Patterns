package com.wangx.CompositeDemo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//首先产生一个根节点
    	IRoot ceo = new Root("王麻子","总经理",100000);
    	//生产三个部门经理，也就是树枝节点
    	IBranch developerDep = new Branch("刘达","研发部门经理",1000);
    	IBranch saleDep = new Branch("马尔","销售部门经理",20000);
    	IBranch financeDep = new Branch("赵三","财务部经理",3000);
    	//再把三个小组长生产出来
    	IBranch firstDevGroup = new Branch("杨三","开发一组组长",5000);
    	IBranch secondDevGroup = new Branch("武大","开发二组组长",6000);
    	//剩下的就是我们这些小兵了，就是路人甲，路人乙
    	ILeaf a = new Leaf("a","开发人员",2000);
    	ILeaf b = new Leaf("b","开发人员",2000);
    	ILeaf c = new Leaf("c","开发人员",2000);
    	ILeaf d = new Leaf("d","开发人员",2000);
    	ILeaf e = new Leaf("e","开发人员",2000);
    	ILeaf f = new Leaf("f","开发人员",2000);
    	ILeaf g = new Leaf("g","开发人员",2000);
    	ILeaf h = new Leaf("h","销售人员",5000);
    	ILeaf i = new Leaf("i","销售人员",4000);
    	ILeaf j = new Leaf("j","财务人员",5000);
    	ILeaf k = new Leaf("k","CEO秘书",8000);
    	ILeaf zhenglaoliu = new Leaf("正老刘","研发部副总",20000);
    	//该生产的人都生产出来了，然后我们怎么组装这颗树
    	//首先是定义总经理下有三个部门经理
    	ceo.add(developerDep);
    	ceo.add(saleDep);
    	ceo.add(financeDep);
    	//总计里下还有一个秘书
    	ceo.add(k);
    	//定义研发部们下的机构
    	developerDep.add(firstDevGroup);
    	developerDep.add(secondDevGroup);
    	//研发部经理下面还有一个副总
    	developerDep.add(zhenglaoliu);
    	//看看开发两个小组下有什么
    	firstDevGroup.add(a);
    	firstDevGroup.add(b);
    	firstDevGroup.add(c);
    	secondDevGroup.add(d);
    	secondDevGroup.add(e);
    	secondDevGroup.add(f);
    	//再看销售部下的人员情况
    	saleDep.add(h);
    	saleDep.add(i);
    	//最后一个财务部
    	financeDep.add(j);
    	//打印写完的数状结构
    	System.out.println(ceo.getInfo());
    	//打印出来整个树形
    	getAllSubordinateInfo(ceo.getSubordinateInfo());
    }
    private static void getAllSubordinateInfo(ArrayList subordinateList){
    	int length = subordinateList.size();
    	//定义一个ArrayList长度，不在for循环中每次计算
    	for(int m=0;m<length;m++){
    		Object s = subordinateList.get(m);
    		if(s instanceof Leaf){//是个叶子节点，也就是员工
    			ILeaf employee = (ILeaf)s;
    			System.out.println(employee.getInfo());
    		}else{
    			IBranch branch = (IBranch)s;
    			System.out.println(branch.getInfo());
    			//再递归调用
    			getAllSubordinateInfo(branch.getSubordinateInfo());
    		}
    	}
    }
}
