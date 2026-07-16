class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=sum-left;
            left+=nums[i];
            if(right==left){
                return i;
            }
        }
        return -1;
    }
}