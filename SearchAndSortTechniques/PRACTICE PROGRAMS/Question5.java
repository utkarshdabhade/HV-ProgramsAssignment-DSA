/* Question 5: Median of Two Sorted Arrays
Skill Mapping: Basic
Description: Solve the LeetCode Problem given as a link below - 
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/

class Question5 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) 
    {
        int[] temp = nums1;
        nums1 = nums2;
        nums2 = temp;
      
    }

    int m = nums1.length;
    int n = nums2.length;
    int totalLength = m + n;
    int mid1 = (totalLength + 1) / 2;
        int mid2 = (totalLength + 2) / 2;
        
        int left = 0;
        int right = m;
        
        while (left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = mid1 - partition1;
            
            int nums1Left = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int nums1Right = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
            int nums2Left = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int nums2Right = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
            
            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                if (totalLength % 2 == 0) {
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                } else {
                    return Math.max(nums1Left, nums2Left);
                }
            } else if (nums1Left > nums2Right) {
                right = partition1 - 1;
            } else {
                left = partition1 + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}

