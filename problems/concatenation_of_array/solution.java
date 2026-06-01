class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums1[]=new int[nums.length*2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            nums1[i]=nums[i];
        }
        for(int j=nums.length;j<nums.length*2;j++)
        {
            nums1[j]=nums[k];
            k++;
        }
        return nums1;
    }
}