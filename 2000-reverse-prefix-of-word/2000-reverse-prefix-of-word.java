class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        if(word.contains(ch+"")){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==ch){
                    sb.append(word.charAt(i));
                    break;
                }
                sb.append(word.charAt(i));
            }
            sb.reverse();
            for(int i=sb.length();i<word.length();i++){
                sb.append(word.charAt(i));
            }
            return sb.toString();
        }
        return word;
    }
}