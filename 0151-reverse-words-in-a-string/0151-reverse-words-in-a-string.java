class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        String[] str=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            if(str[i].length()==0){
                continue;
            }
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}