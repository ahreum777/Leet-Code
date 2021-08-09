class Solution {
	// 앞부터 채움, 비효율적인 서치때문에 더 느림
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
        }
        for(int i = 0 ; i < arr.length ; i++) {
            if(i == arr.length-1) {
                arr[i] = -1;
                break;
            }
            int maxValue = 0;
            for (int j = i+1 ; j < arr.length; j++) {
                maxValue = maxValue < arr[j] ? arr[j] : maxValue;
            }
            arr[i] = maxValue;
        }
        return arr;
    }
	
	// 힌트대로 푼것, 끝부터 채움
	public int[] replaceElements2(int[] arr) {
        int maxValue = -1;
        for(int i = arr.length-1 ; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = maxValue;
            if (maxValue < temp) maxValue = temp;
        }
        return arr;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/