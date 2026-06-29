class Solution {
    public boolean judgeCircle(String moves) {
        int Hcount=0;
        int Vcount=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                Vcount=Vcount+1;
            }
            else if(moves.charAt(i)=='D')
            {
                Vcount=Vcount-1;
            }
            else if(moves.charAt(i)=='L')
            {
                Hcount=Hcount+1;
            }
            else if(moves.charAt(i)=='R')
            {
                Hcount=Hcount-1;
            }
        }
        if(Hcount==0 && Vcount==0)
        {
            return true;
        }
        return false;
    }
}