class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int n:nums){
            sum+=n;
            if(n>9){
                while(n!=0){
                    int digit=n%10;
                    digitSum+=digit;
                    n/=10;
                }
            }else{
                digitSum+=n;
            }
        }
        return Math.abs(sum-digitSum);
    }
}