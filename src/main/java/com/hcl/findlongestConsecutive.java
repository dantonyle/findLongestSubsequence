package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findlongestConsecutive {
	
	public static void runConsecutiveSearch(List<Integer> intArray) {


		int highestSubCount = 0;
		

		List<Integer> tempList = new ArrayList<Integer>();  // list to add numbers temporarily if they are increasing and consecutive
		List<List<Integer>> highestList = new ArrayList<List<Integer>>();  // list of list
		
		tempList.add(intArray.get(0).intValue());  // add first item to temp list
	

			for (int j = 0; j < intArray.size(); j++) {
				if (intArray.get(j).intValue() > tempList.get((tempList.size()-1)).intValue()) {   	// if the current number is greater than the last number inserted into tempList
					tempList.add(intArray.get(j));													// add this current number
				} else {														//-----    if current int is less then check if
					if (highestSubCount < tempList.size()) {   							// check if tempList is bigger than previous largest sequence of 
						highestList = new ArrayList<List<Integer>>();					//-----	 if it is clear out list
						highestList.add(tempList);										//-----  add the new temp list to list
						highestSubCount = tempList.size()-1;   //-------------------save the current highest temporary list count
					} else if (highestSubCount == tempList.size()-1) {           //-----    if current temp list is same size as previous highest sequence then add this new list
						highestList.add(tempList);
					} 
					
					tempList = new ArrayList<Integer>();
					tempList.add(intArray.get(j).intValue());
					
				}
			}
		
			System.out.println("------------------------------------------------------ ");	
			System.out.println("Longest Consecutive Sequence : " + highestList);
			System.out.println("Longest Consecutive Sequence count is : " + (highestSubCount+1));
	}
	
}
