package com.bridgelab.generics;

import java.util.*;

public class Uc2_MaxString {

	
		
		// determines the largest of three Comparable objects
		   
		   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			   
			   // assume x is initially the largest
		                  T max = x;  
		                  
		       // y is the largest so far
		      
		              if(y.compareTo(max) > 0) {
		                     max = y;  
		      }
		      
		      // z is the largest now  
		              
		             if(z.compareTo(max) > 0) {
		         max = z;                 
		      }
		             
		      // returns the largest object 
		      return max;   
		   }
		   public static void main(String args[]) {
			   System.out.println("Maximum String is: " + maximum("pear", "apple", "orange"));
				   }
		   
	
        }  

		
