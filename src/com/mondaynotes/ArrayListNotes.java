package com.mondaynotes;
import java.util.*;
public class ArrayListNotes {

	   public void main(String args[]) {
	      // create an array list
	      ArrayList alienEggs = new ArrayList();
	      System.out.println("Initial size of al: " + alienEggs.size());

	      // add elements to the array list
	      alienEggs.add("C");
	      alienEggs.add("A");
	      alienEggs.add("E");
	      alienEggs.add("B");
	      alienEggs.add("D");
	      alienEggs.add("F");
	      alienEggs.add(1, "A2");
	      System.out.println("Size of al after additions: " + alienEggs.size());

	      // display the array list
	      System.out.println("Contents of al: " + alienEggs);
	      // Remove elements from the array list
	      alienEggs.remove("F");
	      alienEggs.remove(2);
	      System.out.println("Size of al after deletions: " + alienEggs.size());
	      System.out.println("Contents of al: " + alienEggs);
	      
	      alienEggs.get(2);
	   }
}


