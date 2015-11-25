package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuliang.sxl on 2015/11/25.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>((int)Math.ceil(length/0.7));
        for (int index1 = 0; index1 < length; index1++) {
            if (map.containsKey(target - nums[index1])) {
                int result1 = map.get(target - nums[index1]) + 1;
                int result2 = index1 + 1;
                return new int[]{result1, result2};
            }
            map.put(nums[index1], index1);
        }
        return null;
    }
}
