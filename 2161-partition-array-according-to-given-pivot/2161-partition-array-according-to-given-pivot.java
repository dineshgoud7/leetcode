class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int num:nums){
            if(pivot>num){
                arr[index++]=num;
            }
        }
        for(int num:nums){
            if(pivot==num){
                arr[index++]=num;
            }   
        }
        for(int num:nums){
            if(pivot<num){
                arr[index++]=num;
            }
        }
        return arr;
    }
}