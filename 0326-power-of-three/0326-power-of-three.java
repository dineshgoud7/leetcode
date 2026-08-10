class Solution {
    public boolean isPowerOfThree(int n) {
        int i=0;
        int res=0;
        while(res<=n && i<=19){
            res=(int)Math.pow(3,i);
            if(res==n) return true;
            i++;
        }
        return false;
    }
}