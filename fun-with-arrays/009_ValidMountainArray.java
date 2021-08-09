class Solution {
	// 봉우리를 미리 뽑아서 좌우 검사
    public boolean validMountainArray(int[] arr) {    
        if(arr.length < 2) return false;
        
        int maxIdx = 0;  
        for (int i = 0; i < arr.length ; i++) {
            if (i < arr.length-1 && arr[i] == arr[i+1]) return false;
            if (arr[maxIdx] < arr[i]) {
                maxIdx = i;
            }
        }
        
        if (maxIdx == 0 || maxIdx == arr.length-1) return false;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            if (i < maxIdx) {
                if (arr[i] > arr[i+1]) {
                    return false;
                }
            } else {
                if (arr[i] < arr[i+1]) {
                    return false;
                }
            }
        }    
        return true;
    }
	
	// 탐색하며 봉우리 뽑고, 우측 검사
	public boolean validMountainArray2(int[] arr) {
        int pivot = -1;
        if(arr.length < 2) return false;
        if(arr.length == 2 && arr[0]>arr[1]) return false;
        System.out.println(arr.length);
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1] == arr[i]) return false;
            if(arr[i-1] > arr[i]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1 || pivot == 1) return false;
        for (int j = pivot; j < arr.length; j++) {
            if(arr[j-1] <= arr[j]) return false;
            if(j == arr.length-1) return true;
        }
        return false;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/