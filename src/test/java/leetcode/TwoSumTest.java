package leetcode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by xuliang.sxl on 2015/11/25.
 */
public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assertThat(result[0], equalTo(1));
        assertThat(result[1], equalTo(2));
    }
}
