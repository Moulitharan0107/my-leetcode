class Solution {
    public int[] plusOne(int[] digits) {
        int arr[]=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        arr[0]=1;
        for(int j=1;j<digits.length;j++){
            arr[j]=digits[j-1];
        }
        return arr;
    }
}