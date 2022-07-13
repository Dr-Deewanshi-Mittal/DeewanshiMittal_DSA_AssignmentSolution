package com.gl.stock;

import com.gl.sort.MergeSort;

public class StockPrice {

	public void findStockPrice(Double[]stockPrice, double stock) {
		
		MergeSort ms= new MergeSort();
		ms.increasingSortPrice(stockPrice);
		
		int first=0;
		int last=stockPrice.length-1;
		
		
		while(first<=last) {
			int mid=(first+last)/2;
			
	    if (stock==stockPrice[mid]) {
	    	System.out.println("stock present");
	    	break;
	    }
	    else if(stock>stockPrice[mid]) {
	    	first=mid+1;
	    }
	    else if(stock<stockPrice[mid]) {
	    	last=mid-1;
	    }
	}
		if(first>last) {                  
	    	   System.out.println("stock not found");
	    	   return; 
	       }
	}
}
