class Solution {
    public boolean rotateString(String s, String goal) {
        String res=s+s;
        if(s.length()==goal.length()){
            if(res.contains(goal)){
                return true;
            }
        }
        return false;
        
    }
}