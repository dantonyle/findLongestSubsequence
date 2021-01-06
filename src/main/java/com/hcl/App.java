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
        //System.out.println( "Hello World!" );
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(23);
    	nums.add(65);
    	nums.add(55);
    	nums.add(65);
    	nums.add(78);
    	nums.add(30);
    	nums.add(40);
    	nums.add(50);
    	nums.add(60);
    	nums.add(70);
 
    	findlongestConsecutive.runConsecutiveSearch(nums);
    	findLongestSubset.runLongestSub(nums);
    }
}
