class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int nnums[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nnums[i]=nums[i];
        }
        int k=0;
        for(int i=0;i<nnums.length;i++)
        {
            int count=0;
            for(int j=0;j<nnums.length;j++)
            {
                if(i!=j)
                {
                    if(nnums[i]>nnums[j])
                    {
                        count=count+1;
                    }
                }
            }
            nums[k]=count;
            k++;
        }
        return nums;
    }
}