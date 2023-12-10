package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        
    }
    
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (nMap.containsKey(delta)) {
                return new int[]{nMap.get(delta), i};
            } else nMap.put(nums[i], i);
        }
        return  new int[]{};
    }
}
