class Solution {
    public int findNumbers(int[] nums) {
        int ncount=0;
        for(int i:nums)
        {
            int count=0;
            int num=i;
            while(num!=0)
            {
                num=num/10;
                count=count+1;
            }
            if(count%2==0)
            {
                ncount=ncount+1;
            }

        }
        return(ncount);
    }
}