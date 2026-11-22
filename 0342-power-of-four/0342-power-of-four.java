class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0) return false;
        long pow=0;
        long index=1;
        while(pow<=n){
            if(pow==n){
                return true;
            }
            pow=(long)Math.pow(4,index);
            index++;
        }
        return false;
    }
}