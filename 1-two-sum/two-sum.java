class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> Hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(Hm.containsKey(target-nums[i])){
                return new int[]{Hm.get(target-nums[i]),i};
            }
            else{
                Hm.put(nums[i],i);;
            }
        }
        return new int[]{0,0};
    }
}