package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


/*

Given an array of integers nums and an integer target

Return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
  
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) { //Iterate through nums array and make those values will be keys
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution"); // Added to handle cases where no solution is found
    }
    
    public static void main (String[] args) {
    	int nums1[] = {3,2,4};
    	System.out.println(Arrays.toString(twoSum(nums1, 7)));
    	
    	
    	int nums2[] = {2,7,11,15};
    	System.out.println(Arrays.toString(twoSum(nums2, 9)));
    	
    	int nums3[] = {11,22, 100, 44};
    	System.out.println(Arrays.toString(twoSum(nums3, 111)));
    	
    	
    	
    	//Broken Down Explanation:
    	int nums4[] = {3,2,4};
    	System.out.println(Arrays.toString(twoSum(nums4, 7)));
    	//{3=0 , 2=1 , 4=2 }
    	//Compliment check at third iteration, is 7-4=3, check if 3 is in hash which is it.
    	
    	
/*
 Example for Better Understanding:
Suppose the input is nums = [3, 2, 4] and target = 6.

On the first iteration with i = 0 and nums[i] = 3, the complement is 6 - 3 = 3. We check if 3 is in the map. It isn't, so we add (3, 0) to the map.
On the second iteration with i = 1 and nums[i] = 2, the complement is 6 - 2 = 4. We check if 4 is in the map. It isn't, so we add (2, 1) to the map.
On the third iteration with i = 2 and nums[i] = 4, the complement is 6 - 4 = 2. We check if 2 is in the map. It is, and it was seen at index 1. 

Therefore, we return [1, 2] because the numbers at these indices (2 and 4) add up to 6. 
  
 */
    }
}
