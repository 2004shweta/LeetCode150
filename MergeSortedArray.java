class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1;
        int n2 = n - 1;
        int r = m + n - 1;
        while (m1 >= 0 && n2 >= 0) {
            if (nums1[m1] > nums2[n2]) {
                nums1[r] = nums1[m1];  
                m1--;
            } else {
                nums1[r] = nums2[n2];
                n2--;
            }
            r--;
        }

     
        while (n2 >= 0) {
            nums1[r] = nums2[n2];
            n2--;
            r--;
        }
    }
}
