class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int median = (m+n-1) / 2;
        int[] arr = new int[m+n];

        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {

            if(nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];

            }
            else
                arr[k++] = nums2[j++];

        }

        while(i < m) {
            arr[k++] = nums1[i++];
        }

        while(j < n) {
            arr[k++] = nums2[j++];
        }

        if(arr.length % 2 ==0)
            return (((double)arr[median] + (double)arr[median + 1]) / 2);
        else
            return (double)(arr[median]);
    }
}