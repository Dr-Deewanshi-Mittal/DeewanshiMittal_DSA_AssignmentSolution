package com.gl.driver;

import java.util.Scanner;

import com.gl.company.Stockers;
import com.gl.sort.MergeSort;
import com.gl.stock.StockPrice;

class Main {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of company");
		int company=sc.nextInt();
		
		Double[]stockPrice=new Double[company];
		boolean[]status= new boolean[company];
		
		for(int i=0;i<company;i++) 
		{
			System.out.println("Enter current stock price of the company "+(i+1));
			stockPrice[i]=sc.nextDouble();
			System.out.println("Did company's stock price rise today as compared to yesterday?");
			status[i]= sc.nextBoolean();
		}
		
		MergeSort ms=new MergeSort();
		Stockers sk=new Stockers();
		StockPrice sp= new StockPrice();
		
		System.out.println("Enter the operation that you want to perform\r\n"
				+ "1. Display the companies stock prices in ascending order\r\n"
				+ "2. Display the companies stock prices in descending order\r\n"
				+ "3. Display the total no of companies for which stock prices rose today\r\n"
				+ "4. Display the total no of companies for which stock prices declined today\r\n"
				+ "5. Search a specific stock price\r\n"
				+ "6. press 0 to exit\r\n");
	
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			ms.increasingSortPrice(stockPrice);
			sk.printArray(stockPrice);
			break;
		case 2:
			ms.decreasingStockPrice(stockPrice);
			sk.printArray(stockPrice);
			break;
		case 3:
			System.out.println("The no. of company whose stock price rose today are : ");
			sk.stockRose(status, company);
			break;
			
		case 4:
			System.out.println("The no. of company whose stock prices dropped today are : ");
			sk.stockDrop(status, company);
			break;
		case 5:
			System.out.println("Type the stock price you want to search");
			double stock=sc.nextDouble();
			sp.findStockPrice(stockPrice,stock);
			break;
		case 6:
			System.out.println("Exited succesfully");
			System.exit(0);
				break;		
		default:
		        System.out.println("Wrong function selected");	        		        
		}			
		sc.close();
		}
}
