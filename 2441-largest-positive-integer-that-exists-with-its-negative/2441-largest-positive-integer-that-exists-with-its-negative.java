class Solution {
    public int findMaxK(int[] nums) {
        if(nums.length<2) return -1;
        int max=-1;
        int tempmax=-1;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            if(set.contains(-num)){
                tempmax=Math.abs(num);
                max=Math.max(tempmax,max);
            }
        }
        return max;
    }
}