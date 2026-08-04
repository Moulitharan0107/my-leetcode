class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
            max=Math.max(count,max);
            if(nums[i-1]>=nums[i]){
                count=0;
            }
        }
        return (max+1);
    }
}