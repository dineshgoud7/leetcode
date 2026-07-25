class Solution {
    public String reversePrefix(String s, int k) {
        String res="";
        for(int i=k-1;i>=0;i--){
            res+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            res+=s.charAt(i);
        }
        return res;
    }
}