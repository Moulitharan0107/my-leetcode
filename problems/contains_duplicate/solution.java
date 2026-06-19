class Solution {
    public boolean containsDuplicate(int[] nums) {
        LinkedHashSet <Integer> lhs=new LinkedHashSet<>();
        for(int i:nums)
        {
            lhs.add(i);
        }
        if(lhs.size()==nums.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}