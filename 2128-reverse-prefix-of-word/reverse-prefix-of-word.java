class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        StringBuilder a=new StringBuilder();
        for(int i=index;i>=0;i--){
            a=a.append(word.charAt(i));
        }
        for(int i=index+1;i<word.length();i++){
            a=a.append(word.charAt(i));
        }
        return a.toString();
    }
}