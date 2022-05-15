import java.util.Arrays;

public class mergeTwoLists {
    public static void main(String[] args) {
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//                It does not matter what you leave beyond the returned k (hence they are underscores).
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int duplicate  = 0 ;
        for (int i = 0; i <nums.length - 1; i++) {
            if (nums[i] == nums[i+1]){
                nums[i] = Integer.MAX_VALUE;
                duplicate++;
            }
        }
        Arrays.sort(nums);
        return nums.length - duplicate;
    }
}
