class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char max=letters[0];
        int l=0,r=letters.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(letters[mid]>target){
                max=letters[mid];
                r--;
                if(l==r){
                    return max;
                }
            }
            else{
                l++;
            }
        }
        return max;
    }
}