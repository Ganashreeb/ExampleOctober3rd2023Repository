package com.sgtesting.FifteenthOct;
class Product
{
	String prodType, prodName;
	int price;
}
class Order
{
	String orderLoc,orderType;
	int orderNo;
}
class Items
{
	String itemName;  
	int itemNo;
}
public class ProductClassMember 
{
	public static void main(String[] args) 
	{
		Product prod=new Product();
		prod.prodType="AUTO MOBILES";
		prod.prodName="MRF TYRES";
		prod.price=036011;
		System.out.println("PRODUCT TYPE:     "+prod.prodType);
		System.out.println("PRODUCT NAME:     "+prod.prodName);
		System.out.println("PRICE:            "+prod.price);
		System.out.println("###############   ###################");
		System.out.println();
		Order od=new Order();
		od.orderLoc="BANGALORE";
		od.orderType="CASH ON DELIVERY";
		od.orderNo=6013;
		System.out.println("ORDER LOCATION:   "+od.orderLoc);
		System.out.println("ORDER TYPE:       "+od.orderType);
		System.out.println("ORDER NUMBER:     "+od.orderNo);
		System.out.println("###############   ###################");
		System.out.println();
		Items item=new Items();
		item.itemName="WASHING MACHINE";
		item.itemNo=500;
		System.out.println("ITEM NAME:        "+item.itemName);
		System.out.println("ITEM NUMBER:      "+item.itemNo);
	}
}
