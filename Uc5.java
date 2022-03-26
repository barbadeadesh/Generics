package com.bridgelab.generics;

import java.util.*;

public class AllDataType {

	// determines the largest of three Comparable objects
	   
	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	   
	   public static void main(String args[]) {
	      System.out.println("Maximum Integer value is: " + maximum( 3, 4, 5 ));

	      System.out.println("Maximum Integer value is: " + maximum( 6.6, 8.8, 7.7 ));

	      System.out.println("Maximum Integer value is: " + maximum("pear", "apple", "orange"));
	      
	      System.out.println("Maximum Integer value is: " +maximum("A", "B", "c"));
	      
	      System.out.println("Maximum Integer value is: " +maximum(1.12f, 2.22f, 3.18f));
	   }
}
