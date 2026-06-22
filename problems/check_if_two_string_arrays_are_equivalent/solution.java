class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a=word1[0];
        String b=word2[0];
        for(int i=1;i<word1.length;i++)
        {
            a=a+word1[i];
        }
        for(int i=1;i<word2.length;i++)
        {
            b=b+word2[i];
        }
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
}