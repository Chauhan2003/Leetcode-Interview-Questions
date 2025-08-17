class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m-1;
        int nums2Pointer = n-1;
        int mainPointer = m+n-1;

        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] >= nums2[nums2Pointer]) {
                nums1[mainPointer] = nums1[nums1Pointer--];
            } else {
                nums1[mainPointer] = nums2[nums2Pointer--];
            }

            mainPointer--;
        }

        while(nums2Pointer >= 0) {
            nums1[mainPointer--] = nums2[nums2Pointer--];
        }
    }
}