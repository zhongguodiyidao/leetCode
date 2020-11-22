package leetcode;

public class Test26 {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != nums[index]){
                nums[index++] = nums[i];
            }
        }
        return index+1;
    }
}
