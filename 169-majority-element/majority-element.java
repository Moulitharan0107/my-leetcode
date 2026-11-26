class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=Collections.max(hm.values());
        for(int i:hm.keySet()){
            if(hm.get(i)==max){
                return i;
            }
        }
        return 0;
    }
}