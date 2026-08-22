class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split(" ");
        String arr1[]=new String[k];
        for(int i=0;i<k;i++){
            arr1[i]=arr[i];
        }
        return String.join(" ",arr1);
        
    }
}