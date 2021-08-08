public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int n_pivot = n-1, m_pivot = m-1;
        for(int idx = nums1.length-1 ; idx >= 0 ; idx--) {
            /* 정렬되어있으니 생략가능
            if (m_pivot < 0 && n_pivot >= 0) {
                nums1[idx] = nums2[n_pivot--];
            }
            */
            if (n_pivot < 0 && m_pivot >= 0) {
                nums1[idx] = nums1[m_pivot--];
            }
            if (n_pivot >= 0 && m_pivot >= 0) {
                if (nums1[m_pivot] >= nums2[n_pivot]) {
                    nums1[idx] = nums1[m_pivot--];
                } else if (nums1[m_pivot] < nums2[n_pivot]) {
                    nums1[idx] = nums2[n_pivot--];
                }
            }
        }
    }
//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/