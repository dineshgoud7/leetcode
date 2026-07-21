class Solution {
    public boolean hasAlternatingBits(int n) {
        // String bin="";
        // while(n>0){
        //     int digit=n%2;
        //     bin=digit+bin;
        //     n/=2;
        // }
        String bin=Integer.toBinaryString(n);
        for(int i=1;i<bin.length();i++){
            if(bin.charAt(i)==bin.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}