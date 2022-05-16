import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int occurance = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                occurance++;
            }
        }
        Arrays.sort(nums);
        return nums.length - occurance;
    }
}
