class Solution {
    public int removeDuplicates(int[] nums) {
		int cnt = 0;
		if (nums == null || nums.length == 0) return 0;
		for (int i = 0 ; i < nums.length ; i++) {
			if (i == 0) {
				cnt++;
			}
			if (nums[cnt] != nums[i]) {
				cnt++;
				nums[cnt] = nums[i];
			}
		}
		return cnt;
    }
	
	// 불필요상수 now 없앤버전
	public int removeDuplicates2(int[] nums) {
        int cnt = 0;
        if (nums == null || nums.length == 0) return 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[cnt] != nums[i]) {
                cnt+=1;
                nums[cnt] = nums[i];
            }
        }
        return cnt+1;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/