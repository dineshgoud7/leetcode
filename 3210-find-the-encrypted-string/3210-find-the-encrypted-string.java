class Solution {
    public String getEncryptedString(String s, int k) {

        k=k%s.length();
        String res="";
        for(int i=k;i<s.length();i++){
            res+=s.charAt(i);
        }
        for(int i=0;i<k;i++){
            res+=s.charAt(i);
        }
        return res;
    }
}