class Solution {
    public boolean isSameAfterReversals(int num) {
        int num2=num;
        int num1=0;
        int num3=0;
        while(num!=0)   
        {
            int digit=num%10; 
            num1=num1*10+digit;
            num=num/10;
        }
         while(num1!=0)   
        {
            int digit=num1%10; 
            num3=num3*10+digit;
            num1=num1/10;
        }
        if(num2==num3)
        {
            return true;
        }
       return false;
    }
}