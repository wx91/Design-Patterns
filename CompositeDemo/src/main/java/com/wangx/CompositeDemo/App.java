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
    	//首先是组装一个组织结构出来
    	Branch ceo = compositeCorpTree();
    	//首先把CEO的信息打印出来
    	System.out.println(ceo.getInfo());
    	//然后是所有员工信息
    	System.out.println(getTreeInfo(ceo));
    }
    //把整个数组装出来
    public static Branch compositeCorpTree(){
    	//首先产生总经理
    	Branch root = new Branch("王麻子","总经理",100000);
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
    	//首先是定义总经理下有三个部门经理和一个秘书
    	root.addSubordinate(k);
    	root.addSubordinate(developerDep);
    	root.addSubordinate(saleDep);
    	root.addSubordinate(financeDep);
    	
    	//定义研发部们下的机构
    	developerDep.addSubordinate(firstDevGroup);
    	developerDep.addSubordinate(secondDevGroup);
    	//研发部经理下面还有一个副总
    	developerDep.addSubordinate(zhenglaoliu);
    	//看看开发两个小组下有什么
    	firstDevGroup.addSubordinate(a);
    	firstDevGroup.addSubordinate(b);
    	firstDevGroup.addSubordinate(c);
    	secondDevGroup.addSubordinate(d);
    	secondDevGroup.addSubordinate(e);
    	secondDevGroup.addSubordinate(f);
    	//再看销售部下的人员情况
    	saleDep.addSubordinate(h);
    	saleDep.addSubordinate(i);
    	//最后一个财务部
    	financeDep.addSubordinate(j);
    	return root;
    }
    //遍历整棵树，只要给我根节点，我就能遍历出所有节点
    private static String getTreeInfo(Branch root){
    	ArrayList<ICorp> subordinateList = root.getSubordinateInfo();
    	String info = "";
    	for(ICorp s:subordinateList){
 
    		if(s instanceof Leaf){//是员工就直接获得信息
    			info = info + s.getInfo()+"\n";
    		}else{//是小头目
    			info = info + s.getInfo()+"\n"+getTreeInfo((Branch)s);
    		}
    	}
    	return info;
    }
}
