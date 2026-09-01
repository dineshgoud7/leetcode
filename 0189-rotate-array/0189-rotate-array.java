class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0) return;
        k=k%nums.length;
        
        int[] result=new int[nums.length];
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            result[index++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            result[index++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}