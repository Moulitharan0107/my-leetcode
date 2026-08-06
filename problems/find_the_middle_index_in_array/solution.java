class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int l_sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(l_sum==(sum-l_sum-nums[i])){
                return i;
            }
            l_sum=l_sum+nums[i];
        }
        return -1;
    }
}