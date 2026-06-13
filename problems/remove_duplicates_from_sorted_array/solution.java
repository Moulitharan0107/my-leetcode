class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet <Integer>LHS=new LinkedHashSet<>();
        int k=0;
        for(int i:nums)
        {
            LHS.add(i);
        }
        for(int i:LHS)
        {
            nums[k]=i;
            k++;
        }
        return LHS.size();
    }
}