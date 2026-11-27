class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character,Integer> a=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            a.put(t.charAt(i),a.getOrDefault(t.charAt(i),0)-1);
        }
        for(int i:a.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}