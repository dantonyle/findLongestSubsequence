package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findLongestSubset {

	public static void runLongestSub(List<Integer> intArray) {


		int highestSubCount = 0;
		int currentLargeInt = 0;
		
		
		// ---- sublist of original array containing only numbers based on FIRST LOOP
		List<Integer> subSetList = new ArrayList<Integer>(); 
		
		// ---- temporary list to store increasing integers
		List<Integer> tempList = new ArrayList<Integer>(); 
		
		// ---- List of a list of Integers
		List<List<Integer>> highestList = new ArrayList<List<Integer>>();

		// -------------------------------------- FIRST LOOP to set starting sequence
		// based off of original array "intArray"
		for (int i = 0; i < intArray.size() - 1; i++) {
			
			// -------------------------------------- clean the tempList and set the first
			// new.... creates a new pointer for tempList
			tempList = new ArrayList<Integer>(); 

			// -------------------------------------- create a subset of original array
			subSetList = intArray.subList(i, intArray.size());

			// TEST--------------------------------- System.out.println(subSetList);
			// added first value of the subset to temp list
			tempList.add(subSetList.get(0)); 
			
			// current largest integer is the first value of this
			
			currentLargeInt = tempList.get(0); 
			
			// if the current subSetList SIZE is lower then highestSubCount there is no need to see if the sequence is longer
			if (subSetList.size() > highestSubCount) {
		
				// -------------------------------------- loop through the sub set
				for (int j = 0; j < subSetList.size(); j++) {
					
					// if this index(intValue) is greater than my current largest int
					// ----- if current value isn't larger, then do nothing
					if (subSetList.get(j).intValue() > currentLargeInt) { 
						
						// make this value my current largest value
						currentLargeInt = subSetList.get(j).intValue(); 
						
						// add this value to my temp list
						tempList.add(subSetList.get(j)); 
					} 
					
				}

				// -------------------------------------- check the current temp list of subsequence SIZE
				// ---- if it is bigger than previous highest sequence count... make new list of list pointer and add current temp list to it
				if (highestSubCount < tempList.size() - 1) { 
					
					highestList = new ArrayList<List<Integer>>();
					highestList.add(tempList);
					
					//save the new highest Sub Count
					highestSubCount = tempList.size() - 1; 
					
				} else if (highestSubCount == tempList.size() - 1) { 
					// ---- if it is the same as previous count... add it to current list of list
					highestList.add(tempList);
				} // --- If it not bigger or the same.. do nothing
			}

		}

		System.out.println("------------------------------------------------------ ");
		System.out.println( "Longest Increasing Sub Sequence has numbers that are increasing but are not consecutive in the original array \n" );
		System.out.println("Longest Sub Sequence : " + highestList);
		System.out.println("Longest Sub Sequence count is : " + (highestSubCount + 1));

	}

}
