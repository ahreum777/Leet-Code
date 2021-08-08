class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0, nowCnt = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 1) {
                nowCnt++;
                maxCnt = maxCnt < nowCnt ? nowCnt : maxCnt;
            } else {
                nowCnt = 0;
            }
        }
        return maxCnt;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/