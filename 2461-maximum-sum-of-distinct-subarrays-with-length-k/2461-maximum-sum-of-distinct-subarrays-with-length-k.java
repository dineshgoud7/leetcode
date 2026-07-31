class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long maxsum=0,currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(i>=k-1){
                if(map.size()==k){
                    maxsum=Math.max(currsum,maxsum);
                }
                int left=nums[i-k+1];
                currsum-=left;
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
            }
        }
        return maxsum;
    }
}