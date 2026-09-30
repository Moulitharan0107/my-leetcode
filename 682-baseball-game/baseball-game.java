class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s=new Stack<>();
        for(String i:operations){
            if(i.equals("C")){
                s.pop();
            }
            else if(i.equals("D")){
                s.push(s.peek()*2);
            }
            else if(i.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else{
                s.push(Integer.parseInt(i));
            }
        }
        int count=0;
        while(!s.isEmpty()){
            count=count+s.pop();
        }
        return count;
    }
}