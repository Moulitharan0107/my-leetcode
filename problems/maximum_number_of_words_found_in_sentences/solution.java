class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=1;
        int max_count=1;
        for(int i=0;i<sentences.length;i++)
        {
            String a=sentences[i];
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)==' ')
                {
                    count=count+1;
                }
            }
            if(count>max_count)
            {
                max_count=count;
            }
            count=1;
        }
        return max_count;
    }
}