class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        for(int num:nums1){
            min=Math.min(num,min);
        }
        if(min%2==1) return true;
        for(int i:nums1){
            if(i%2==1){
                return false;
            }
        }
       return true;
    }
}