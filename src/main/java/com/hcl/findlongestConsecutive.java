package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findlongestConsecutive {
	
	public static void runConsecutiveSearch(List<Integer> intArray) {
		int maxConsec = 0;
		int consec = 0;
		int startIndex = 0;
		int endIndex = 0;
		
		// temporary List to hold sublist
		List<Integer> tempArray = new ArrayList<Integer>();
		
		// loop through list
		for (int i = 0; i < intArray.size()-1; i++) {
			// if next element is greater than current element
			if (intArray.get(i+1) > intArray.get(i)) {
				consec++;
				endIndex = i+1;
				
				// current consecutive counter is greater that current max number of consecutive numbers then save the subList of the array
				if (consec > maxConsec) {  
					maxConsec = consec;
					tempArray = intArray.subList(startIndex, endIndex+1);
				}
			} else {  // since next number is not greater then current number reset consecutive counter
				consec = 0;
				startIndex = i+1;
			}
		}
		
		// print temporary subList
		
		System.out.println("Longest Consecutive Sequence: " + tempArray);
		
		
	}
	
	
}
