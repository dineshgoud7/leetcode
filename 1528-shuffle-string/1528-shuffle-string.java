class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res=s.toCharArray();
        int i=0;
        for(int n:indices){
            res[n]=s.charAt(i);
            i++;
        }
        s=new String(res);
        return s;
    }
}