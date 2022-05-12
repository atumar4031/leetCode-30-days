
import java.util.*;

public class sumToTarget {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int[] returnValue = twoSum(nums,6);
        System.out.println(Arrays.toString(returnValue));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++){
                int current = nums[i] + nums[j];
                if (current == target){
                    return new int[]{i , j};
                }
            }

        }
        return new int[]{};
    }

}
