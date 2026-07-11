class Solution {
    public String defangIPaddr(String address) {
        String a="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)!='.')
            {
                a=a+address.charAt(i);
            }
            else
            {
                a=a+"[.]";
            }
        }
        return a;
    }
}