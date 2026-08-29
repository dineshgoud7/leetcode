class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum==k) return 0;
        if(sum>k){
            sum=sum%k;
            return sum;
        }
        return sum;

    }
}