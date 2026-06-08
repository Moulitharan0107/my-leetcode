class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int first=0;
        for(String i:operations)
        {
            if(i.equals("X++")||i.equals("++X"))
            {
                first=first+1;
            }
            else if(i.equals("X--")||i.equals("--X"))
            {
                first=first-1;
            }
        }
        return first;
    }
}