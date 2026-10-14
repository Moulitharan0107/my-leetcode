class Solution {
    public int maxVowels(String s, int k) {
        int win_count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                win_count++;
            }
        }
        max=win_count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                win_count=win_count+1;
            }
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                    win_count--;
                }
            max=Math.max(win_count,max);
        }
        return max;
    }
}