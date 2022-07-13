package com.gl.company;


public class Stockers {
	
   public void stockRose(boolean[]status,int company)
   {	
	   int count=0; 
	   for(int i=0;i<company;i++) {
		   if(status[i]==true) {
			   count++;			   
		   }
		   break;
	   }
	   System.out.println(count);	   
   }
   
   public void stockDrop(boolean[]status,int company) 
   {
	   int count=0;
	   for(int i=0;i<company;i++) {
		  
		   if(status[i]==false) {
			   count++;			   
		   }
	   }
	  System.out.println(count);
   }
   

public void printArray(Double[]array) 
{
	for(int i=0;i<array.length;i++)
	{
		 System.out.print(array[i]+" ");		        
	}
}
}