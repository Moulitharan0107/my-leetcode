class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[]=word.toCharArray();
        int l=0,r=word.indexOf(ch);
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}