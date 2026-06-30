class Solution {
    public boolean detectCapitalUse(String word) {
        int Ucount=0;
        int Lcount=0;
        int Gcount=0;
        char A;
        char a;
        for(int i=0;i<word.length();i++)
        {
            A=word.charAt(i);
            if(A>='A' &&  A<='Z')
            {
                Ucount=Ucount+1;
            }
        }
        for(int i=0;i<word.length();i++)
        {
            a=word.charAt(i);
            if(a>='a' &&  a<='z')
            {
                Lcount=Lcount+1;
            }
        }
        if(Ucount==word.length())
        {
            return true;
        }
        else if(Lcount==word.length())
        {
            return true;
        }
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(0)>='A' && word.charAt(0)<='Z')
            {
                if(i>0)
                {
                    if(word.charAt(i)>='a' && word.charAt(i)<='z')
                    {
                        Gcount=Gcount+1;
                    }
                }
            }
        }
        if(Gcount==word.length()-1)
        {
            return true;
        }
        return false;
    }
}