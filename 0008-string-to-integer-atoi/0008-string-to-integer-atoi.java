class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0) return 0;
        long res=0;
        boolean neg=false;
        int i=0;
        if(s.charAt(0)=='-'){
            neg=true;
            i=1;
        }
        if(s.charAt(0)=='+'){
            i=1;
        }
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                res=(res*10)+(s.charAt(i)-'0');
                if(res>Integer.MAX_VALUE){
                    return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
            }else{
                if(neg){
                    return (int)-res;
                }
                return (int)res;
            }
            i++;
        }
        if(neg){
            return (int)-res;
        }
        return (int)res;
    }
}