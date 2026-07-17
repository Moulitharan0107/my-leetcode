class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a="";
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                a=a+first.charAt(i);
            }
            else{
                break;
            }
        }
        return a;
    }
}