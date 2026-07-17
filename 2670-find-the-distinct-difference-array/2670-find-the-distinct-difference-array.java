class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] diff=new int[nums.length];
        for(int i=1;i<=nums.length;i++){
            HashSet<Integer> rset=new HashSet<>();
            HashSet<Integer> lset=new HashSet<>();
            int rcount=0;
            int lcount=0;
            for(int j=i;j<nums.length;j++){
                rset.add(nums[j]);
            }
            rcount=rset.size();
            for(int k=i-1;k>=0;k--){
                lset.add(nums[k]);
            }
            lcount=lset.size();
            diff[i-1]=lcount-rcount;
        }
        return diff;
    }
}