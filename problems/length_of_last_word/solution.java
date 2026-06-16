class Solution {
    public int lengthOfLastWord(String s) {
        String a=s.strip();
        int count=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)!=' ')
            {
                count=count+1;
            }
            else
            {
                return count;
            }
        }
        return count;
    }
}