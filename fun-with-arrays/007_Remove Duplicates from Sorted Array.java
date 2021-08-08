class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int k = 1, pick = nums[0];
        for (int i = 1 ; i < nums.length; i++) {
            if (nums[i] != pick) {
                pick = nums[i];
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/