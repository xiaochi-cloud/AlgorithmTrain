package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 霄池
 * @Date 2024/6/11 22:35 <a href="https://leetcode.cn/problems/two-sum/">...</a>
 */
public class TowSum {
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //
    //你可以按任意顺序返回答案。
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            Integer exceptResult = target - nums[i];
            if (map.containsKey(exceptResult)) {
                return new int[] {map.get(exceptResult), i};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TowSum towSum = new TowSum();
        int[] ints = towSum.twoSum(new int[] {2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(ints));

    }
}
