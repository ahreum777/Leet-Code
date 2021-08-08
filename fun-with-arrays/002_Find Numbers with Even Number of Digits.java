class Solution {
	public int findNumbers(int[] nums) {
        int evenNumber = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            int digits = 0;
            while (0 < nums[i]) {
                digits++;
                nums[i] /= 10;
            }
            if (digits % 2 == 0) evenNumber++;
        }
        System.out.println(evenNumber);
        return evenNumber;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/