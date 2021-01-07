package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findLongestSubset {

	public static void runLongestSub(List<Integer> intArray) {

		/*     0  1    2  3  4  5
		 * // 23 65 | 55 65 77 78 79 30 40 23 50 60 70
		 * 
		 * 
		 * j = 55		 0
		 * temp list  [ 23, 65, 78 ]
		 * currentLargest = 65
		 */

		int highestSubCount = 0;
		int currentLargeInt = 0;
		
		
		List<Integer> subSetList = new ArrayList<Integer>();              //---- sublist of original array containing only numbers based on FIRST LOOP
		List<Integer> tempList = new ArrayList<Integer>();                //---- temporary list to store increasing integers 
		List<List<Integer>> highestList = new ArrayList<List<Integer>>();

		//-------------------------------------- FIRST LOOP to set starting sequence based off of original array "intArray"
		for (int i = 0; i < intArray.size() - 1; i++) {
			//--------------------------------------  clean the tempList and set the first list
			tempList = new ArrayList<Integer>();  		// new.... creates a new pointer for tempList
			
			//-------------------------------------- create a subset of original array starting
			subSetList = intArray.subList(i, intArray.size());
			
			//-------------------------------------  System.out.println(subSetList);
			tempList.add(subSetList.get(0));     // added first value of the subset to temp list
	
			currentLargeInt = tempList.get(0);  // current largest integer is the first value of this 

			//-------------------------------------- loop through the sub set 
			for (int j = 0; j < subSetList.size(); j++) {
				if (subSetList.get(j).intValue() > currentLargeInt) {   // if my currentLarge ( which was the last number appended to my list ) is smaller
					currentLargeInt = subSetList.get(j).intValue();
					tempList.add(subSetList.get(j));
				}
			}
			
			//--------------------------------------  check the current temp list of subsequence 
			if (highestSubCount < tempList.size()-1) {   			// if current temporary count 
				highestList = new ArrayList<List<Integer>>();
				highestList.add(tempList);
				highestSubCount = tempList.size()-1;   //-------------------save the current highest temporary list count
			} else if (highestSubCount == tempList.size()-1) {
				highestList.add(tempList);
			} 

		}
		
		System.out.println("------------------------------------------------------ ");
		System.out.println("Longest Sub Sequence : " + highestList);
		System.out.println("Longest Sub Sequence count is : " + (highestSubCount+1));

		 
	}
	
}
