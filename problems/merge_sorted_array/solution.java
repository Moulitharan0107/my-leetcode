import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(i>=m)
            {
                nums1[i]=nums2[k];
                k++;
            }
        }
        Arrays.sort(nums1);
        //System.out.print(Arrays.toString(nums1));
    }
}