package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findlongestConsecutive {
	
	public static void runConsecutiveSearch(List<Integer> intArray) {


		int highestSubCount = 0;
		
		// list to add numbers temporarily if they are increasing and consecutive
		List<Integer> tempList = new ArrayList<Integer>();  
		
		// list of list
		List<List<Integer>> highestList = new ArrayList<List<Integer>>();  
		
		// add first item to temp list
		tempList.add(intArray.get(0).intValue());  
	

			for (int j = 0; j < intArray.size(); j++) {
				
				// if the current number is greater than the last number inserted into tempList
				if (intArray.get(j).intValue() > tempList.get((tempList.size()-1)).intValue()) {
					
					// add this current number
					tempList.add(intArray.get(j));			
					
				} else {														
					
					//-----    if current int is less then check if tempList is bigger than previous largest sequence of 
					if (highestSubCount < tempList.size()) {   		
						
						//-----	 if it is clear out list
						highestList = new ArrayList<List<Integer>>();	
						
						//-----  add the new temp list to list
						highestList.add(tempList);		
						
						//-------------------save the current highest temporary list count 
						highestSubCount = tempList.size()-1;  
						
						//-----    if current temp list is same size as previous highest sequence then add this new list
					} else if (highestSubCount == tempList.size()-1) {           
						highestList.add(tempList);
					} 
					
					//--- clear out temp List by creating new pointer of ArrayList<Integer>
					tempList = new ArrayList<Integer>(); 
					
					//--- add current integer to new temp list 
					tempList.add(intArray.get(j).intValue());   
					
				}
			}
		
			System.out.println("------------------------------------------------------ ");	
			System.out.println( "Longest Increasing Consecutive Sequence has numbers that are increasing consecutively in the original array \n" );
			
			System.out.println("Longest Consecutive Sequence : " + highestList);
			System.out.println("Longest Consecutive Sequence count is : " + (highestSubCount+1));
	}
	
}
