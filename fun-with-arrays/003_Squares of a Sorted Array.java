class Solution {
    public int[] sortedSquares(int[] nums) {
        // the squares of each number
        for (int i = 0 ; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // sorting arrays
        for (int i = 0 ; i < nums.length ; i++) {
            int minNum = nums[i], minIndex = 0;
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (minNum > nums[j]) {
                    minIndex = j;
                    minNum = nums[j];
                }
            }
            if (nums[i] > minNum) {
                nums[minIndex] = nums[i];
                nums[i] = minNum;
            }
        }
        return nums;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/