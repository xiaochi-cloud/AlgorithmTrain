package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author 霄池
 * @Date 2024/6/11 22:57
 * <a href="https://leetcode.cn/problems/3sum/solutions/115585/san-shu-zhi-he-javajian-ji-ti-jie-by-wang-zi-hao-z/">题解</a>
 */
public class ThreeSum {
    //给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] +
    // nums[k] == 0 。请
    //
    //你返回所有和为 0 且不重复的三元组。
    //
    //注意：答案中不可以包含重复的三元组。
    public List<List<Integer>> threeSum(int[] nums) {

        return fun4(nums);
    }

    private static ArrayList<List<Integer>> fun4(int[] nums) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int numResult = nums[i];
            if (i > 0 && numResult == nums[i - 1]) {
                continue;
            }
            int head = i + 1, tail = nums.length - 1;
            while (head < tail) {
                int r = nums[head] + nums[tail] + nums[i];
                if (r == 0) {
                    result.add(Arrays.asList(nums[i], nums[head], nums[tail]));

                    for (++head; head < tail && nums[head] == nums[head - 1]; ++head)
                        ; // 跳过重复数字
                    for (--tail; tail > head && nums[tail] == nums[tail + 1]; --tail)
                        ; // 跳过重复数字

                }
                if (r < 0) {
                    head++;
                }
                tail--;
            }

        }
        return result;
    }

    /**
     * 夹逼法
     * @param nums
     * @return
     */
    private static ArrayList<List<Integer>> fun3(int[] nums) {
        //1. 排序
        Arrays.sort(nums);

        LinkedHashSet<List<Integer>> result = new LinkedHashSet<>();
        //2.夹闭
        for (int i = 0; i < nums.length - 2; i++) {
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                int except = -nums[i];
                int caculatorResult = nums[tail] + nums[head];
                //跳出条件
                if (caculatorResult == except) {
                    result.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    tail--;
                    continue;
                }
                if (caculatorResult > except) {
                    tail--;
                    continue;
                }
                head++;
            }
        }
        return new ArrayList<>(result);
    }

    /**
     * 两重暴力+hash
     * @param nums
     * @return
     */
    private static ArrayList<List<Integer>> fun1(int[] nums) {
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer outerExcept = -nums[i];

            HashMap<Integer, Integer> innerMap = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                Integer current = nums[j];
                Integer existResult = outerExcept - current;

                Integer exist = innerMap.get(existResult);

                if (exist != null) {
                    List<Integer> list = Arrays.asList(nums[i], current, exist);
                    list.sort(Comparator.naturalOrder());
                    result.add(list);

                }
                innerMap.put(current, current);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4});

        System.out.println(lists);

    }
}
