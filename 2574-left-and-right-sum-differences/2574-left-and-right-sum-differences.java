class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        int left=0;
        int sum=Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            int tempsum=0;
            tempsum=Math.abs(left-(sum-nums[i]-left));
            left+=nums[i];
            arr[i]=tempsum;
        }
        return arr;
    }
}