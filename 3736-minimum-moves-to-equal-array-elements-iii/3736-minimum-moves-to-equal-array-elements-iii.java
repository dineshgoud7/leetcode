class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int count=0;
        for(int num:nums){
            if(num==max){
                continue;
            }else{
                int diff=Math.abs(num-max);
                count+=diff;
            }
        }
        return count;
    }
}