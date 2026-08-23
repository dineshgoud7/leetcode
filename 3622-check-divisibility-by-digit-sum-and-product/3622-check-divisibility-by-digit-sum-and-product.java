class Solution {
    public boolean checkDivisibility(int n) {
        int pro=1;
        int sum=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            pro*=digit;
            sum+=digit;
            temp/=10;
        }
        return n%(sum+pro)==0;
    }
}