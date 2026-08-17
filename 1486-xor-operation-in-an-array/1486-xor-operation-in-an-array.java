class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start;
            start+=2;
        }
        int res=nums[0];
        for(int i=1;i<n;i++){
            res=res^nums[i];
        }
        return res;
    }
}