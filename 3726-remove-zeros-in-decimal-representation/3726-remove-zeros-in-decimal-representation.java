class Solution {
    public long removeZeros(long n) {
        long sum=0;
        while(n!=0){
            long digit=n%10;
            if(digit!=0){
                sum=(sum*10)+digit;
            }
            n/=10;
        }
        long rev=0;
        while(sum!=0){
            long digit=sum%10;
            rev=(rev*10)+digit;
            sum/=10;
        }
        return rev;
    }
}