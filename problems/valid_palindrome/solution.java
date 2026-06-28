class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        String b="";
        String c="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                continue;
            }
            else if((a.charAt(i)>='a' && a.charAt(i)<='z')||(a.charAt(i)>='0' && a.charAt(i)<='9'))
            {
                b=b+a.charAt(i);
            }
        }
        for(int i=b.length()-1;i>=0;i--)
        {
            c=c+b.charAt(i);
        }
        if(b.equals(c))
        {
            return true;
        }
        return false;
    }
}