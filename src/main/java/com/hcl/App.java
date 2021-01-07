package com.hcl;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(23);
    	nums.add(65);
    	nums.add(55);
    	nums.add(65);
    	nums.add(77);
    	nums.add(78);
    	nums.add(79);
    	nums.add(30);
    	nums.add(40);
    	nums.add(23);
    	nums.add(50);
    	nums.add(60);
    	nums.add(70);
    	
    	for (int g = 0; g < 20; g++) {
    		Integer ranNum =  (Integer.valueOf((int)(Math.random()*(30 - 10)+10)));
    		nums.add(ranNum);
    	}
    	for (int g = 0; g < 20; g++) {
    		Integer ranNum =  (Integer.valueOf((int)(Math.random()*(70 - 30)+30)));
    		nums.add(ranNum);
    	}
    	for (int g = 0; g < 20; g++) {
    		Integer ranNum =  (Integer.valueOf((int)(Math.random()*(90 - 75)+75)));
    		nums.add(ranNum);
    	}
    	
    	System.out.println("List of numbers: " + nums);
    	findlongestConsecutive.runConsecutiveSearch(nums);
    	findLongestSubset.runLongestSub(nums);
    }
}
