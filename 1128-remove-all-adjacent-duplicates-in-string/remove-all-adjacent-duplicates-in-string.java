class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> a=new Stack<>();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!a.isEmpty() && s.charAt(i)==a.peek()){
                a.pop();
            }
            else{
                a.push(s.charAt(i));
            }
        }
        for(char i:a){
            b.append(i);
        }
        return b.toString();
    }
}