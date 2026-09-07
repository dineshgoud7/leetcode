class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] res=new int[nums.length];
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            res[index++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            res[index++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}