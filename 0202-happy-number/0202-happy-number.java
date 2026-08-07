class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
            if(n==0 && sum==1){
                return true;
            }
            if((n==0 && sum>9) || (n==0 && sum==7)){
                n=sum;
                sum=0;
            }
        }
        return false;
    }
}