package com.sgtesting.NoArgsConstructor;
class Product
{
	String prodType, prodName;
	int price;
	Product()
	{
		prodType="AUTO MOBILES";
		prodName="MRF TYRES";
		price=036011;
		System.out.println("PRODUCT TYPE:     "+prodType);
		System.out.println("PRODUCT NAME:     "+prodName);
		System.out.println("PRICE:            "+price);
		System.out.println("###############   ###################");
		System.out.println();
	}
}
class Order
{
	String orderLoc,orderType;
	int orderNo;
	Order()
	{
		orderLoc="BANGALORE";
		orderType="CASH ON DELIVERY";
		orderNo=6013;
		System.out.println("ORDER LOCATION:   "+orderLoc);
		System.out.println("ORDER TYPE:       "+orderType);
		System.out.println("ORDER NUMBER:     "+orderNo);
		System.out.println("###############   ###################");
		System.out.println();
	}
}
class Items
{
	String itemName;  
	int itemNo;
	Items()
	{
		itemName="WASHING MACHINE";
		itemNo=500;
		System.out.println("ITEM NAME:        "+itemName);
		System.out.println("ITEM NUMBER:      "+itemNo);
	}
}
public class ProductConstructor 
{
	public static void main(String[] args) 
	{
		Product prod=new Product();
		Order od=new Order();
		Items item=new Items();

	}
}
