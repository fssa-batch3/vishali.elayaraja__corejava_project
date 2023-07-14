package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

//Create an ArrayList<Integer> of numbers with duplicate entries. 
//Use an HashSet<Integer> to remove the duplicates and display the Unique values

public class ToRemoveDuplicateInt {
public static void main(String[] args) {
	
	
	  ArrayList<Integer> number = new ArrayList<>();
	  
	  number.add(18);
	  number.add(26);
	  number.add(15);
	  number.add(3);
	  number.add(15);
	  number.add(30);
	  number.add(30);
	  number.add(30);
	  System.out.println("Using ArrayList : " + number);
	  
	  System.out.println();
	  
	  //Set stores unique elements and ignores duplication
      HashSet<Integer> numberSet = new HashSet<Integer>();
      numberSet.add(18);
      numberSet.add(26);
      numberSet.add(15);
      numberSet.add(3);
      numberSet.add(15);
      numberSet.add(30);
      numberSet.add(30);
      numberSet.add(30);
      System.out.println("Using Set : " + numberSet);
}
}
