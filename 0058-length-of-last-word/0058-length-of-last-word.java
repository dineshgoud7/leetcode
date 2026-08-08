class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] str=s.split(" ");
        int len=str.length;
        if(len==0) return 0;
        return str[len-1].length();
        
    }
}