package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class findLongestSubset {

	public static void runLongestSub(List<Integer> intArray) {

		/*
		 * (23,65,55,65,78,30,40,50,60);
		 */

		int highestSubCount = 0;
		int subCount = intArray.size();
		int currentLargeInt = 0;
		int length = intArray.size();
		
		List<Integer> tempList = new ArrayList<Integer>();
		List<Integer> subSetList = new ArrayList<Integer>();
		List<List<Integer>> highestList = new ArrayList<List<Integer>>();

		// for loop to set every number of the array to starting subsequence
		for (int i = 0; i < intArray.size() - 1; i++) {
			// clean the tempList and set the first list
			subCount = 0;
			tempList = new ArrayList<Integer>();
			currentLargeInt = intArray.get(i);
			tempList.add(intArray.get(i));

			// use subset of original array
			subSetList = intArray.subList(i, length);

			for (int j = 0; j < subSetList.size(); j++) {
				if (subSetList.get(j).intValue() > currentLargeInt) {
					currentLargeInt = subSetList.get(j).intValue();
					tempList.add(subSetList.get(j));
					subCount++;
				}
			}

			if (highestSubCount < subCount) {
				highestList = new ArrayList<List<Integer>>();
				highestList.add(tempList);
				highestSubCount = tempList.size()-1;
			} else if (highestSubCount == subCount) {
				highestList.add(tempList);
			}

		}
		
		System.out.println("Longest Sub Sequence : " + highestList);

		 
	}
	
}
