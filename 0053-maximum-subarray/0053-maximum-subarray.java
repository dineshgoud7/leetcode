class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            if(currsum>max){
                max=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return max;
    }
}