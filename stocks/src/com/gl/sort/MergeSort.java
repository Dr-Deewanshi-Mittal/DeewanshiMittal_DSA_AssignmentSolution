package com.gl.sort;

import java.util.Arrays;
import java.util.Collections;

public class MergeSort {

	public void decreasingStockPrice(Double[]array) {
		   Arrays.sort(array,Collections.reverseOrder());		    
	   }
	
	public void increasingSortPrice(Double[]array) {
		int size= array.length;
		if(size<2) {
			return;
		}		
		 int mid =size/2;
		 
		 Double[]leftarray= new Double[mid];
		 Double[] rightarray=new Double[size-mid];
		 
		 for(int i=0;i<mid;i++) {
			 leftarray[i]= array[i];
		 }
		 for (int i=mid;i<size;i++) {
			 rightarray[i-mid]=array[i];
		 }
		 increasingSortPrice(leftarray);
		 increasingSortPrice(rightarray);
		 merge(array,leftarray,rightarray);
		 
	}
	private void merge(Double[]array, Double[]leftarray,Double[]rightarray) {
		int left=leftarray.length;
		int right=rightarray.length;
		int i=0,j=0,k=0;
		
		while(i<left && j<right) {
			if(leftarray[i]<=rightarray[j]) {
				array[k]=leftarray[i];
				i++;				
			}
			else {
				array[k]=rightarray[j];
				j++;				
			}
			k++;			
		}
		while(i<left) {
				array[k]=leftarray[i];
				i++;k++;		
		}
			while(j<right) {
				array[k]=rightarray[j];
				j++;k++;
			}
		
	}
}


