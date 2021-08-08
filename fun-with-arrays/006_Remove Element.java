class Solution {
    public int removeElement(int[] nums, int val) {
        int put_pivot = nums.length-1, k = nums.length;
        for(int del_pivot = 0; del_pivot < k ; del_pivot++) {
            if (nums[del_pivot] == val) {
                while (del_pivot <= put_pivot) {
                    if (nums[put_pivot] == val) {
                        k--;
                        put_pivot--;
                    } else {
                        break;
                    }
                }
                if(del_pivot <= put_pivot) {
                    nums[del_pivot] = nums[put_pivot--]; k--;
                }
            }
        }
        return k;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

