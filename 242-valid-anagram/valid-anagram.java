class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>HM=new HashMap<>();
        for(char i:s.toCharArray()){
            HM.put(i,HM.getOrDefault(i,0)+1);
        }
        Map<Character,Integer>HM1=new HashMap<>();
        for(char i:t.toCharArray()){
            HM1.put(i,HM1.getOrDefault(i,0)+1);
        }
        return(HM1.equals(HM));
    }
}