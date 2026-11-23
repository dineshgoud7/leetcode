class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0;i<s.length();i++){
           int index=t.indexOf(s.charAt(i));
           if(index!=-1){
            t=t.substring(0,index)+t.substring(index+1);
           }
        }
        return t.charAt(0);
    }
}