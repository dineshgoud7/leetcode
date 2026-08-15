class Solution {
    public boolean checkRecord(String s) {
        int lcount=0;
        int acount=0;
        for(int i=0;i<s.length();i++){
            if('A'==s.charAt(i)){
                acount++;
                lcount=0;
                if(acount>=2){
                    return false;
                }
            }
            if('L'==s.charAt(i)){
                lcount++;
            }
            if('P'==s.charAt(i)){
                lcount=0;
            }
            if(lcount==3){
                return false;
            }
        }
        return true;
    }
}