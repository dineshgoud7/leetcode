class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String s:operations){
            if(s.charAt(0)=='+'){
                ++X;
            }else if(s.charAt(2)=='+'){
                X++;
            }else if(s.charAt(0)=='-'){
                --X;
            }else{
                X--;
            }
        }
        return X;
    }
}