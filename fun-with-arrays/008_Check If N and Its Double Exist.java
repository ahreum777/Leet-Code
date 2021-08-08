class Solution {
	public boolean checkIfExist(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ;i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]*2 || arr[i]*2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }	
	public boolean checkIfExist2(int[] arr) {
        for(int i = 0 ; i < arr.length ;i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]*2) {
                    return true;
                }
            }
        }
        return false;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
//메모리 후자가 덜씀