package com.wangx.MediatorDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractMediator mediator = new Mediator();
    	//采购人员采购电脑
    	System.out.println("-----采购人员采购电脑-----");
    	Purchase purcahse = new Purchase(mediator);
    	purcahse.buyIBMComputer(100);
    	//销售人员销售电脑
    	System.out.println("\n-----销售人员销售电脑-----");
    	Sale sale = new Sale(mediator);
    	sale.sellIBMComputer(1);
    	//库房管理人员管理库房
    	System.out.println("\n-----库房管理人员清库处理-----");
    	Stock stock = new Stock(mediator);
    	stock.clearStock();
    }
}
