package com.bridgelab.generics;

import java.util.*;

public class Uc3_Double {

	 // determines the largest of three Comparable objects
	   
	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
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
		   System.out.println( "Maximum Double value is: " + maximum( 6.6, 8.8, 7.7 ));
	   }
}
