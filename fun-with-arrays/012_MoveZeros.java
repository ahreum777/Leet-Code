class Solution {
	// 효율이 덜어짐
    public void moveZeroes(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++) {
            int numIdx = i+1;
            if(nums[i] == 0) {
                while(numIdx < nums.length && nums[numIdx] == 0) {
                    numIdx++;
                }
                if(numIdx < nums.length && nums[numIdx] != 0) {
                    nums[i] = nums[numIdx];
                    nums[numIdx] = 0;
                }
            }
        }
    }
	
	// two pointer 활용에 더 알맞음
	public void moveZeroes2(int[] nums) {
        int writePointer = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                nums[writePointer++] = nums[i];
            }
        }
        while(writePointer < nums.length) {
            nums[writePointer++] = 0;
        }
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/